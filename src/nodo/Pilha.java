package nodo;

public class Pilha {

	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0; // É opcional. Nem toda pilha precisa ter um limite
	
	public Pilha(int limite) {
		this.limite = limite;
	}
	
	public int getTopo() {
		return topo.getDado();
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	// Inserir no topo
	
	public void push(int dado) {
		if(temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			novoItem.setProx(topo);
			topo = novoItem;
			tamanho++;
		} else
			System.out.println("Pilha cheia!");
	}
	
	// Remover do topo
	
	public void pop() {
		if(!estaVazio()) {
			topo = topo.getProx();
			tamanho--;
			System.out.println(topo.getDado() + " foi retirado da pilha.");
		} else
			System.out.print("A pilha está vazia!");
	}
	
}