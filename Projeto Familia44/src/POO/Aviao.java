package POO;

public class Aviao {
	private String companhia;
	private String modelo;
	private float gasolina;
	private int ano;
	private boolean aeroporto;
	
	//linha 9 - construtor
	public Aviao (String companhia,String modelo,float gasolina, int ano)
	{
		this.companhia=companhia;
		this.modelo = modelo;
		this.gasolina = gasolina;
		this.ano = ano;
	
	}

	public String getCompanhia() { //esperando um resultado
		return companhia;
	}

	public void setCompanhia(String companhia) { //dou ordem 
		this.companhia = companhia;
	}

	public String getModelo() {
		return modelo; 
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void voar() {
		if (gasolina >= 500) {
			System.out.println("O avião decola");
		}
		else {
			System.out.println("O avião não decola");
		}
	
	}
	public boolean getAeroporto() { 
		return aeroporto;
	}

	public void setAeroporto(boolean aeroporto) {
		this.aeroporto = aeroporto;
	}

	public void pouso() {
		//boolean aeroporto = true; // não tenho 
		if (aeroporto == true ) {  // preciso de um
			System.out.println("O avião posso pousar");
			
		}
		else {
			System.out.println("O avião não pode poudar");
		}
		
	}

}
