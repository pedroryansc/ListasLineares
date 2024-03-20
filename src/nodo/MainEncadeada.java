package nodo;

public class MainEncadeada {
	public static void main(String[] args) {
		
		// Testando a classe Nodo
		
		Nodo nodo1 = new Nodo(5);
		Nodo nodo2 = new Nodo(6);
		Nodo nodo3 = new Nodo(8);
		
		nodo1.setProx(nodo2);
		nodo2.setProx(nodo3);
		
		int valorNodo2 = nodo1.getProx().getDado();
		System.out.println(valorNodo2);
		
		int valorNodo3 = nodo2.getProx().getDado();
		System.out.println(valorNodo3);
		
		// Testando a classe ListaEncadeada
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserirInicio(5);
		lista.inserirInicio(7);
		lista.inserirInicio(4);
		
		lista.mostraLista();
		
		lista.deleteComValor(5);
		lista.mostraLista();
		
		System.out.println(lista.getInicio());
		
		lista.inserirFinal(8);
		lista.mostraLista();
		
		lista.inserirFinal(5);
		/*
		lista.deleteComValor(4);
		lista.deleteComValor(7);
		lista.deleteComValor(8);
		lista.deleteComValor(5);
		*/
		lista.mostraLista();
		
		lista.contaNodos();
		
		lista.deletePrimeiro();
		lista.mostraLista();
		
		lista.deleteUltimo();
		lista.mostraLista();
		
		lista.inserirInicio(4);
		lista.inserirFinal(5);
		lista.mostraLista();
		
		lista.procuraValor(8);
		
		/*
		lista.deletePrimeiro();
		lista.deletePrimeiro();
		lista.deletePrimeiro();
		lista.mostraLista();
		
		lista.deleteUltimo();
		lista.mostraLista();
		*/
	}
}