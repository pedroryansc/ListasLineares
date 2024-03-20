package nodo;

public class ListaCircular {

	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if(inicio == null) { // Caso a lista esteja vazia
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else { // Caso a lista não esteja vazia
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public String mostrarLista() {
		String lista = "";
		if(inicio == null) return lista;
		Nodo aux = inicio;
		do {
			lista += aux.getDado() + "\n";
			aux = aux.getProx();
		} while(aux != inicio);
		return lista;
	}
	
	public void deleteComValor(int dado) {
		if(inicio == null) return;
		if(inicio.getDado() == dado) {
			if(inicio == fim) { // Se a lista possui somente 1 elemento
				inicio = null;
				return;
			}
			// Se o elemento a ser removido for o primeiro da lista, mas a lista contém mais elementos
			inicio = inicio.getProx();
			fim.setProx(inicio);
			return;
		}
		Nodo aux = inicio;
		do {
			if(aux.getProx().getDado() == dado) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		} while(aux != inicio);
	}
	
	// Inserir no final
	
	public void inserirFinal(int dado) {
		if(inicio == null) {
			inserirInicio(dado);
			return;
		}
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		fim.setProx(novoNodo);
		fim = novoNodo;
	}
	
	// Buscar valor e retornar sua posição na lista
	
	public void buscarValor(int valor) {
		if(inicio == null)
			System.out.println("A lista está vazia");
		int cont = 1;
		Nodo aux = inicio;
		do {
			if(valor == aux.getDado()) {
				System.out.println("O valor " + valor + " se encontra na posição " + cont + " da lista.");
				return;
			}
			cont++;
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println("O valor " + valor + " não se encontra na lista.");
	}
	
}