package HerançaAula;

public class TesteEmpregado {
	public static void main(String[] args) {
		
		Empregado emp = new Empregado("Giulia", "Rua da Marola,123","52024466771",978484480,23,322,6500,15);
		
		emp.impostoInfo();
		emp.calcularSalario();
	}

}
