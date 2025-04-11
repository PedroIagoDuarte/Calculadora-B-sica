package calabreso;
import java.util.Scanner; //IMPORTANDO LIB DE SCANNER
public class Calabreso {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //ATRIBUINDO LIB SCANNER A VARIAVEL "LEIA"
		int operacao = 0;
		float resultado;              // DETERMINANDO TIPO DAS VARIAVEIS
		float numero1, numero2;

		System.out.println("CALCULADORA SIMPLES");

		while (operacao != 5) {
			System.out.println("\nESCOLHA A OPERAÇÃO DESEJADA:");
			System.out.println("(1) - Adição");
			System.out.println("(2) - Subtração");
			System.out.println("(3) - Divisão");           //CRIANDO LOOP PRO MENU DA CALCULADORA
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
