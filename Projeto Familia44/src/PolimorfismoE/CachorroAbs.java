package PolimorfismoE;

	public class CachorroAbs extends ClasseAbs {
		
		public CachorroAbs(){ //declarando metodo construtor
			super("Cachorro");
			
		}
		
		@Override
		public void som (double quantidade) {
			quantidade = Math.random()*5.0;
			
				System.out.println("Au au au au au!!");
		}
}
