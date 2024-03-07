package nodo;

public class ListaEncadeada {

	private Nodo inicio;
	
	public ListaEncadeada() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void inserirFinal(int dado) {
		if(vazia()) {
			inserirInicio(dado);
			return;
		}
		Nodo novoNodo = new Nodo(dado);
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
	}
		
	public void mostraLista() {
		if(vazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		Nodo aux = inicio;
		while(aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProx();
		}
		System.out.println();
	}
	
	public void deleteComValor(int valor) {
		if(vazia())
			return;
		if(inicio.getDado() == valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	
	public void deletePrimeiro() {
		if(vazia())
			return;
		inicio = inicio.getProx();
	}
	
	public void deleteUltimo() {
		if(vazia())
			return;
		Nodo aux = inicio;
		if(inicio.getProx() == null) {
			inicio = null;
			return;
		}
		while(aux.getProx().getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(null);
	}
	
	public void contaNodos() {
		int cont = 0;
		Nodo aux = inicio;
		while(aux != null) {
			cont++;
			aux = aux.getProx();
		}
		System.out.println("A quantidade total de nodos é " + cont);
	}
	
	public void procuraValor(int valor) {
		if(vazia()) {
			System.out.println("A lista está vazia.");
			return;
		}
		int cont = 1;
		Nodo aux = inicio;
		while(aux != null) {
			if(aux.getDado() == valor) {
				System.out.println("O valor " + valor + " está na posição " + cont + " da lista.");
				return;
			}
			cont++;
			aux = aux.getProx();
		}
		System.out.println("O valor " + valor + " não se encontra na lista.");
	}
	
}