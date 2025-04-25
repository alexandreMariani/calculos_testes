package app.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private List<Integer> lista;
	private int soma;
	private double media;
	private double mediana;
	private double maior;
	private double menor;
	private double num_elementos;
	private double moda;
	private double primeiro;
	private double ultimo;
	
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

	public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    public double getNum_elementos() {
        return num_elementos;
    }

    public void setNum_elementos(double num_elementos) {
        this.num_elementos = num_elementos;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }

    public double getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(double primeiro) {
        this.primeiro = primeiro;
    }

    public double getUltimo() {
        return ultimo;
    }

    public void setUltimo(double ultimo) {
        this.ultimo = ultimo;
    }

}
