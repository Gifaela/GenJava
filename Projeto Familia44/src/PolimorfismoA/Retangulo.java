package PolimorfismoA;

public class Retangulo extends BaseFigura implements Figura {
	
	Retangulo(double lado1, double lado2, String nome)
	{
		super(lado1, lado2, nome);
		nomeClasse = "Retangulo";
		
	}
	@Override
	public double getDiagonal()
	{
		return Math.sqrt(Math.pow(lado1,2) + Math.pow(lado2,2));
		
	}
}
