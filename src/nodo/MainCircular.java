package nodo;

public class MainCircular {
	public static void main(String[] args) {
		
		// Testando a classe ListaCircular
		
		ListaCircular lista = new ListaCircular();
		
		lista.inserirInicio(8);
		lista.inserirInicio(5);
		lista.inserirInicio(4);
		System.out.println(lista.mostrarLista());
		
		lista.deleteComValor(5);
		System.out.println(lista.mostrarLista());
		
		lista.inserirFinal(2);
		lista.inserirFinal(10);
		System.out.println(lista.mostrarLista());
		
		lista.buscarValor(10);
		
		lista.deleteComValor(10);
		lista.deleteComValor(2);
		lista.deleteComValor(8);
		lista.deleteComValor(4);
		System.out.println("Lista: " + lista.mostrarLista());
		
		lista.inserirFinal(5);
		lista.inserirFinal(7);
		System.out.print(lista.mostrarLista());
		
	}
}