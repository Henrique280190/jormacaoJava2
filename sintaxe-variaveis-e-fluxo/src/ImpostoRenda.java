public class ImpostoRenda {

	public static void main(String[] args) {

		System.out.println("Testando condicionais (If's)!");

		double salario = 3751.01;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("O IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("O IR � de 15% e pode deduzir R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("O IR � de 22.5% e pode deduzir R$ 636");
		}
	}

}
