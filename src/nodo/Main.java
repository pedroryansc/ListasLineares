package nodo;

public class Main {
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
		
	}
}