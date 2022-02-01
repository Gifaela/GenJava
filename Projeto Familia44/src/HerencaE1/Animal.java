/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
						Animal
			Cachirrp	Cavalo		Preguiça			
*			Nome		Nome		Nome
*			Idade		Idade		Idade
*			Emite som	Emite som	Emite som
*			Corre		Corre		Sobe árvores
*/
package HerencaE1;

public class Animal { //1-Criando classe
	
	private String nomeAnimal;
	private int idadeAnimal;
	private boolean emiteSom;
	private String deslocamento;
	
	//3 _ciando metodo construtor da SuperClase
	public Animal(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento){//paranetro publico
		super();
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.emiteSom = emiteSom;
		this.deslocamento = deslocamento;

	}
	//4- Criar Getter e Setter
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public boolean isEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}

	public String getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(String deslocamento) {
		this.deslocamento = deslocamento;
	}

	
	
	
	
}
