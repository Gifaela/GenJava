package HerencaE1;

	public class Cachorro extends Animal { //1 - criar a SubClass
		
		private String racaCachorro;//2- Criar atributos da SubClasse
		
		
		//3 - Criar metodo construtor puxando da superclasse
		public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento,String racaCachorro)
		{
			super(nomeAnimal,idadeAnimal,emiteSom,deslocamento);// trago os parametros da minha super classe
			this.racaCachorro = racaCachorro;
		}
		
		//4- Criar Método simples
		public void infoCachorro() {
			System.out.print(getNomeAnimal()+" é um Cachorro que tem "+getIdadeAnimal()+" anos, ");
			if(isEmiteSom()) {
				System.out.print("emite um latido");
			}
			else
			{
				System.out.print("não emite som");
			}
			System.out.print(", "+getDeslocamento()+" o tempo todo, e é da raça "+racaCachorro);
		}
		//5- criar gette & setter

		public String getRacaCachorro() {
			return racaCachorro;
		}

		public void setRacaCachorro(String racaCachorro) {
			this.racaCachorro = racaCachorro;
		}
		
	}
