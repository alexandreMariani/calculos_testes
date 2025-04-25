package app.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entrada {
	
	private List<Integer> lista;

	public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

}
