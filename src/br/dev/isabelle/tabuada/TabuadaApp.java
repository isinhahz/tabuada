package br.dev.isabelle.tabuada;

import br.dev.isabelle.tabuada.model.Tabuada;

public class TabuadaApp {
	
	public static void main(String[] args) {

	Tabuada t1 = new Tabuada();
	t1.setMultiplicando(8);
	t1.setMinimoMultiplicador(4);
	t1.setMaximoMultiplicador(6);
	t1.mostrarTabuada();
	
	Tabuada t2 = new Tabuada();
	t2.setMultiplicando(459);
	t2.setMinimoMultiplicador(687);
	t2.setMaximoMultiplicador(714);
	t2.mostrarTabuada();


	}

}
