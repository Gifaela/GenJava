package POO;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente Giu = new Cliente("Giulia Rafaela", 1.65, 76.4);
		Cliente Hud = new Cliente("Hudson Lucas", 1.75,68.5);
		
		double imc = Giu.getPeso()/(Giu.getAltura()*Giu.getAltura());
		
		//System.out.println("Peso da Giu é: "+Giu.getPeso());
		//System.out.println("Peso do Hud é: "+Hud.getPeso());
		
		System.out.println("A cliente " + Giu.getNome() + " tem o IMC de " + Giu.imc());
			

	}

}
