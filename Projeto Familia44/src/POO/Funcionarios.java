package POO;

public class Funcionarios {
	
	private String nome;
	private String area; //area de atuação
	private int tempoSer;
	private int idade;
	private double salário;
	
	public Funcionarios(String nome, String area, int tempoSer, int idade, double salário) {
		super();
		this.nome = nome;
		this.area = area;
		this.tempoSer = tempoSer;
		this.idade = idade;
		this.salário = salário;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getTempoSer() {
		return tempoSer;
	}

	public void setTempoSer(int tempoSer) {
		this.tempoSer = tempoSer;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalário() {
		return salário;
	}

	public void setSalário(double salário) {
		this.salário = salário;
	}
	
	
	
	

}
