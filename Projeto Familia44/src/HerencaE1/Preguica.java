package HerencaE1;

public class Preguica extends Animal{ //1-criando uma SubClasse
	
	//2-Criando Atributos
	private String corDoOlho;
	
	//3- Criando Método Construtor com Herança

	public Preguica(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento,String corDoOlho) {
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.corDoOlho = corDoOlho;
	}
		
	//4- Criar Método simples
		
		public void infoPreguica() {
			System.out.print(getNomeAnimal()+" é uma Preguiça que tem "+getIdadeAnimal()+" anos, ");
				if(isEmiteSom()) {
					System.out.print("emite grunidos");
				}
				else
				{
					System.out.print("não emite som");
				}
					System.out.print(", "+getDeslocamento()+" o tempo todo, e tem os olhos da cor "+corDoOlho);
				

		}
	//5 - criar Getter & Setter
		public String getCorDoOlho() {
			return corDoOlho;
		}

		public void setCorDoOlho(String corDoOlho) {
			this.corDoOlho = corDoOlho;

	
	}
}
