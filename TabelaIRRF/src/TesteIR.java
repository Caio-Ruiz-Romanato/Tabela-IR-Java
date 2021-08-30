public class TesteIR {
	
	public static void main(String[] args) {
		System.out.println("Tabela de calculo do IRRF");
		
		double salario = 1903.98;
		
		if (salario <= 1903.98) {
			System.out.println("Isento");
		} else if (salario >= 1903.98 && salario <= 2826.65) {
			System.out.println("Sua alíquota é de 7,50%");
			System.out.println("Você pode deduzir até R$ 142,80");
		} else if (salario >= 2826.65 && salario <= 3751.05) {
			System.out.println("Sua alíquota é de 15%");
			System.out.println("Você pode deduzir até R$ 354,80");
		} else if (salario >= 3751.05 && salario <= 4664.68) {
			System.out.println("Sua alíquota é de 22,50%");
			System.out.println("Você pode deduzir até R$ 636,13");
		} else {
			System.out.println("Sua alíquota é de 27,50%");
			System.out.println("Você pode deduzir até R$ 869,36");
		}
	}
}