package POO;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		
		Conta contaGiu = new Conta("Giulia", "Santander",600);
		
		System.out.println(contaGiu.getSaldo());
		
		contaGiu.deposito(200.00);
		
		System.out.println(contaGiu.getSaldo());
		
		//contaGiu.saque(700)
		
		System.out.println("Foi sacado "+contaGiu.saque(700)+" e o total em conta agora é: "+contaGiu.getSaldo());
	}

}
