package PolimorfismoA; // sub class

public class Quadrado extends BaseFigura implements Figura
{

	
	Quadrado(double lado, String nome)
	{
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
		
	}
	@Override
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}

}
