package POO;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado (String nome, double salario) 
	// pode utilizar otros nomer (Ex: public Empregado (String n, double s)
	{
		this.setNome(nome);
		this.setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario*= 1 + percentual/100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //pega a moeda corrente do país (R$)
		nf.setMinimumFractionDigits(2); // duas casas depois da virgula.
		String formatoMoeda = nf.format(salario);// formata o atributo com uma formatação monetária
		return formatoMoeda;
		
	}
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Salario: "+this.formatarMoeda());
	}
}
