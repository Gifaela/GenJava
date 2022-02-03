package PolimorfismoA;

	public class Celular extends Telefone {
	
		public Celular()
		{
			super("Telefone Celular");
			
		}
		@Override // é um metodo polimorfico
		public void toca(int codigoToque)
		{
			switch (codigoToque)
			{
			case 1: 
				System.out.println("\nTanãnãnã...Tanãnãnã");
				break;
			case 2: 
				System.out.println("\nPanãnã...Panãnã");
				break;
				default:
					System.out.println("\nTinãnã...Nãnini");
			}
		}
		@Override // é um metodo polimorfico
		public void disca(String numero)
		{
			System.out.println("\nO número: "+numero+ " é um celular...");
		}
	}
