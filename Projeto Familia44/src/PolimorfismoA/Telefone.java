package PolimorfismoA;

	public abstract class Telefone { // classe abstrata // classe mãe -> super classe
		
		private String tipo;
		
		abstract public void disca(String numero);// método abstrato
		abstract public void toca(int numToques);
		
		public Telefone (String tipo)
		{
			this.tipo = tipo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
	}
