package calabreso;
import java.util.Scanner;
public class Calabreso {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int operacao = 0;
		float resultado;
		float numero1, numero2;

		System.out.println("CALCULADORA SIMPLES");

		while (operacao != 5) {
			System.out.println("\nESCOLHA A OPERAÇÃO DESEJADA:");
			System.out.println("(1) - Adição");
			System.out.println("(2) - Subtração");
			System.out.println("(3) - Divisão");
			System.out.println("(4) - Multiplicação");
			System.out.println("(5) - SAIR");
			operacao = leia.nextInt();

			if (operacao >= 1 && operacao <= 4) {
				System.out.print("DIGITE O PRIMEIRO NUMERO: ");
				numero1 = leia.nextFloat();

				System.out.print("DIGITE O SEGUNDO NUMERO: ");
				numero2 = leia.nextFloat();

				switch (operacao) {
					case 1:
						resultado = numero1 + numero2;
						System.out.println("O RESULTADO É: " + resultado);
						break;
					case 2:
						resultado = numero1 - numero2;
						System.out.println("O RESULTADO É: " + resultado);
						break;
					case 3:
						if (numero2 != 0) {
							resultado = numero1 / numero2;
							System.out.println("O RESULTADO É: " + resultado);
						} else {
							System.out.println("DIVISAO IMPOSSIVEL POR 0");
						}
						break;
					case 4:
						resultado = numero1 * numero2;
						System.out.println("O RESULTADO É: " + resultado);
						break;
				}
			} else if (operacao == 5) {
				System.out.println("OBRIGADO PELA PREFERÊNCIA");
			} else {
				System.out.println("DIGITE UM NÚMERO VÁLIDO!");
			}
		}
		leia.close();
	}
}
