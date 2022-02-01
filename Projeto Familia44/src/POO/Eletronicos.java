package POO;

import java.text.NumberFormat;

public class Eletronicos {
	
	private String produto;
	private String marca;
	private String cor;
	private double valor;
	
	public Eletronicos(String produto, String marca, String cor, double valor) {
		super();
		this.produto = produto;
		this.marca = marca;
		this.cor = cor;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void descontoValor(double percentual)
	{
		valor*= 1 - (percentual/100);
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //pega a moeda corrente do país (R$)
		nf.setMinimumFractionDigits(2); // duas casas depois da virgula.
		String formatoMoeda = nf.format(valor);// formata o atributo com uma formatação monetária
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println(produto+"\t\t"+"Valor: "+this.formatarMoeda());
	}

}
