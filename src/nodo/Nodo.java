package nodo;

public class Nodo {

	private int dado;
	private Nodo prox; // Endereço do próximo nodo
	
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nodo [dado=");
		builder.append(dado);
		builder.append(", prox=");
		builder.append(prox);
		builder.append("]");
		return builder.toString();
	}
	
}