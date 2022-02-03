package PolimorfismoA; //interface

public interface Figura { //classe abstrata// metodos abstratos e não abstratos
	
	public String nomeInterface = "FIguar";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
}
