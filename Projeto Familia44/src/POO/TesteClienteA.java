package POO;

public class TesteClienteA {
	public static void main(String[] args) {
		
		ClienteA cliente1 = new Cliente("Geraldo Vedrossi",1234);
		
		cliente1.comprar();
		
		System.out.println("\n" + cliente1.getInfo());
	}

}
