package POO;

public class TesteAviao {
	public static void main(String[] args) {
		
					//new -> novo objeto
		Aviao[] avi = new Aviao[2];
		                  //construtor
		avi[0] = new Aviao("Tam","A319",500,2017);
		avi[1] = new Aviao("Gol","B737-800",300,2011);
		
		System.out.println("A comanhia "+avi[0].getCompanhia()+" possui o modelo "+avi[0].getModelo()+" do ano" +avi[0].getAno());
		System.out.println("A comanhia "+avi[1].getCompanhia()+" possui o modelo "+avi[1].getModelo()+" do ano" +avi[1].getAno());
		
		avi[0].setCompanhia("Azul");
		avi[0].voar();
		avi[1].voar();
		avi[0].setAeroporto(false);//não pousa
		avi[1].setAeroporto(true); //pousa
		avi[0].pouso();
		avi[1].pouso();
		
		System.out.println("\n************************");
		
		System.out.println("A comanhia "+avi[0].getCompanhia()+" possui o modelo "+avi[0].getModelo()+" do ano" +avi[0].getAno());
		System.out.println("A comanhia "+avi[1].getCompanhia()+" possui o modelo "+avi[1].getModelo()+" do ano" +avi[1].getAno());
		
		
	}

}
