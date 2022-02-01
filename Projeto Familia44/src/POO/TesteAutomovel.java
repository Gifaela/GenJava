package POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um objeto da classe Automovel
										//todos Strings, se p ano é int
		Automovel auto1 = new Automovel("Pedro","Fiat 147","VDRO191",1965);
		
		auto1.imprirInfo();
		System.out.println("\nTransferência de Propietário");
		auto1.setNomeProprietario("Denise");
		auto1.setPlaca("CXX4007");
		System.out.println("\n*******************************************");
		auto1.imprirInfo();
		

	}

}
