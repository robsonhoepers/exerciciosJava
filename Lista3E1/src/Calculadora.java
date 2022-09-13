import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		char menu = ' ';
		double resultado = 0;
		
		
		while(menu != 'n' && menu != 'N') {
			System.out.println("Calculadora Básica, Informe a operação:");
			System.out.println("'+' Somar");
			System.out.println("'-' Subtrair");
			System.out.println("'/' Dividir");
			System.out.println("'*' Multiplicar");
			System.out.println("Para encerrar pressione 'n'.");
			
			menu = tc.next().charAt(0);
			
			switch (menu) {
			case '+':
				resultado = somar(tc);
				System.out.println("Resultado = " + resultado);
				break;
			case '-':
				resultado = subtrair(tc);
				System.out.println("Resultado = " + resultado);
				break;
				
			case '/':
				resultado = dividir(tc);
				System.out.println("Resultado = " + resultado);
				break;
				
			case '*':
				resultado = multiplicar(tc);
				System.out.println("Resultado = " + resultado);
				break;
				
			case 'n':
			case 'N':
				System.out.println("Programa encerrado!");
				break;
			default:
				
				System.out.println("Opção Inválida!");
				break;			
				
			}
		
		}
	}
	private static double somar(Scanner tc) {
		System.out.println("Digite num1: ");
		double num1 = tc.nextDouble();
		System.out.println("Digite num2: ");
		double num2 = tc.nextDouble();
		CalcMetodos calcMetodos = new CalcMetodos(0);
		calcMetodos.somar(num1, num2);
		return calcMetodos.getMemoria();
	}
	private static double subtrair(Scanner tc) {
		System.out.println("Digite num1: ");
		double num1 = tc.nextDouble();
		System.out.println("Digite num2: ");
		double num2 = tc.nextDouble();
		CalcMetodos calcMetodos = new CalcMetodos(0);
		calcMetodos.subtrair(num1, num2);
		return calcMetodos.getMemoria();
	}
	private static double dividir(Scanner tc) {
		System.out.println("Digite num1: ");
		double num1 = tc.nextDouble();
		System.out.println("Digite num2: ");
		double num2 = tc.nextDouble();
		CalcMetodos calcMetodos = new CalcMetodos(0);
		calcMetodos.dividir(num1, num2);
		return calcMetodos.getMemoria();
	}
	private static double multiplicar(Scanner tc) {
		System.out.println("Digite num1: ");
		double num1 = tc.nextDouble();
		System.out.println("Digite num2: ");
		double num2 = tc.nextDouble();
		CalcMetodos calcMetodos = new CalcMetodos(0);
		calcMetodos.multiplicar(num1, num2);
		return calcMetodos.getMemoria();
	}
}
