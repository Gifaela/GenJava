package HerencaE1;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro dog = new Cachorro("Pipoca", 14, false, "anda", "Beadle");
		Cavalo cav = new Cavalo("Balla", 5, true, "galopa", "Caramelo");
		Preguica pre = new Preguica("Naninha", 7, true, "sobe em árvores", "Preto");
		
		dog.infoCachorro();
		System.out.println("\n\n");
		cav.infoCavalo();
		System.out.println("\n\n");
		pre.infoPreguica();
		
		
		
	}

}
