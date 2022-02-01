package POO;

import java.util.Scanner;

public class ClienteA {
	
	double vp,vt; // vp-- valor do produtovt -- valor total
	
	Scanner leia = new Scanner(System.in);
	
	private String nomeCliente;
	private int codigoCliente;
	
	public ClienteA(String nome, int codigo)
	{
		this.nomeCliente = nome;
		this.codigoCliente = codigo;
		
	}
	
	public Scanner getLeia()
	{
		return leia;
		
	}
	
	public void setLeia (Scanner leia)
	{
		this.leia = leia;
		
	}
	
	public double getVp()
	{
		return vp;
	}
	
	public void setVp(double vp)
	{
		this.vp = vp;
	}
	
	public double getVt()
	{
		return vt;
	}
	
	public void setVt(double vt)
	{
		this.vt = vt;
	}
	
	public String getNomeCliente() 
	{
		return nomeCliente;
	}
	
	public void getNomeCliente(String nomeCliente) 
	{
		this.nomeCliente = nomeCliente;
		
	}
	
	public int getCodigoCliente()
	{
		return codigoCliente;
		
	}
	
	public void setCodigoCliente(int codigoCliente)
	{
		this.codigoCliente = codigoCliente;
		
	}
	
	public double valorTotal(double vt)
	{
		System.out.println("\n valor de cada prorama deve ser inserido"
	+"individualmente\nPara finalizar entre com 0 ou algum número negativo...");
		
		do
		{
			System.out.println("\nEntre com o valo: ");
			
			vp = leia.nextDouble(); //15
			if(vp>0)
			{
				vt = vt + vp;
			}
		}
		while(vp>0);
		return vt;
	}
	public String getInfo()
	{
		String info = nomeCliente + "\t\t" + codigoCliente;
		return info;

	}
	public void comprar()
	{
		System.out.printf("\nTotal: %.2f", this.valorTotal(0.0));
	}

}
