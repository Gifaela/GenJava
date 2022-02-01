package POO;

public class TesteEletronicos {
	
	public static void main(String[] args) {
		
		Eletronicos ele = new Eletronicos("Celular", "Apple", "Prata", 5000);
			ele.descontoValor(10);
			ele.imprimir();
		
	}

}
