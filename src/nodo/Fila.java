package nodo;

public class Fila {

	private Nodo inicio;
	private Nodo fim;
	private int limite; // Também é opcional. Nem toda fila precisa ter limite
	private int tamanho = 0;
	
	public Fila(int limite) {
		this.limite = limite;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public Integer getInicio() {
		if(!estaVazio()) return inicio.getDado();
		else {
			System.out.println("A fila está vazia!");
			return null;
		}
	}
	
	public void inserir(int dado) {
		if(temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			if(estaVazio()) {
				inicio = novoItem;
				fim = novoItem;
			} else {
				fim.setProx(novoItem);
				fim = novoItem;
			}
			// fim = novoItem;
			tamanho++;
		} else
			System.out.println("Fila cheia!");
	}
	
	public Integer remover() {
		if(estaVazio())
			return null;
		int valor = inicio.getDado();
		inicio = inicio.getProx();
		tamanho--;
		if(estaVazio())
			fim = null;
		return valor;
	}
	
}