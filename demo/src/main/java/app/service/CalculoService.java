package app.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dto.Entrada;
import app.entity.Calculo;
import app.repository.CalculoRepository;

@Service
public class CalculoService {

    @Autowired
    private CalculoRepository calculoRepository;

    public Calculo calcular(Entrada entrada) {

        Calculo calculo = new Calculo();
        calculo.setLista(entrada.getLista());
        calculo.setSoma(this.soma(entrada.getLista()));
        calculo.setMedia(this.media(entrada.getLista()));
        calculo.setMediana(this.mediana(entrada.getLista()));
        calculo.setMaior(this.maior(entrada.getLista()));
        calculo.setMenor(this.menor(entrada.getLista()));
        calculo.setNum_elementos(this.numElementos(entrada.getLista()));
        calculo.setModa(this.moda(entrada.getLista()));
        calculo.setPrimeiro(this.primeiro(entrada.getLista()));
        calculo.setUltimo(this.ultimo(entrada.getLista()));

        return calculo;
    }

    public int soma(List<Integer> lista) {
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == null)
                throw new RuntimeException("Erro: Valor nulo encontrado na lista.");
            else
                soma += lista.get(i);
        }
        return soma;
    }

    public double media(List<Integer> lista) {
        return this.soma(lista) / (double) lista.size();
    }

    public double mediana(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        Collections.sort(lista);

        if (lista.size() % 2 == 1) {
            return lista.get(lista.size() / 2);
        } else {
            int meio1 = lista.get(lista.size() / 2 - 1);
            int meio2 = lista.get(lista.size() / 2);
            return (meio1 + meio2) / 2.0;
        }
    }

    public double maior(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        return Collections.max(lista);
    }

    public double menor(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        return Collections.min(lista);
    }

    public double numElementos(List<Integer> lista) {
        if (lista == null) {
            throw new IllegalArgumentException("A lista não pode ser nula");
        }
        return lista.size();
    }

    public double moda(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        int moda = lista.get(0);
        int maxCount = 0;
        for (Integer num : lista) {
            int count = Collections.frequency(lista, num);
            if (count > maxCount) {
                maxCount = count;
                moda = num;
            }
        }
        return moda;
    }

    public double primeiro(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        return lista.get(0);
    }

    public double ultimo(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        return lista.get(lista.size() - 1);
    }
}
