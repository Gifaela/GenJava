package HerencaE1;

public class Cavalo extends Animal{//1-criando uma SubClasse

	//2-Criando Atributos
		private String corCavalo; 
		
	//3 - Criando Método Construtor com Herança
	
		public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento,String corCavalo) {
			
			super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
			this.corCavalo = corCavalo;
			
		}
	//4- Criar Método simples
		
		public void infoCavalo() {
			System.out.print(getNomeAnimal()+" é um Cavalo que tem "+getIdadeAnimal()+" anos, ");
				if(isEmiteSom()) {
					System.out.print("emite relincho");
				}
				else
				{
					System.out.print("não emite som");
				}
					System.out.print(", "+getDeslocamento()+" o tempo todo, e é da cor "+corCavalo);
				}
	//5 - criar Getter & Setter

		public String getCorCavalo() {
			return corCavalo;
		}

		public void setCorCavalo(String corCavalo) {
			this.corCavalo = corCavalo;
		}
		
}
