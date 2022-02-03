/*Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque
o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
*/
package PolimorfismoE;

	public abstract class ClasseAbs {
		
		private String especie; // declarando atributos
		
		public ClasseAbs(String especie) { //declarando metodo construtor
			this.especie=especie;
		}
		abstract public void som(double quantidade); //Abstract é uma clase abstrata // CONTRATO
		
		public String getEspecie() { // declarando Getter
			return especie;
		}
		
		public void setEspecie() { // declarando Setter
			this.especie = especie;
		}
		

	}
