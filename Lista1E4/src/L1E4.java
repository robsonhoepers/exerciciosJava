import java.util.Scanner;

public class L1E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		char menu = ' ';
		double pesoIdeal = 0;
		
		while(menu != 'n' && menu != 'N') {
			System.out.println("Calculo Peso ideal, Informe:");
			System.out.println("'F' Feminino");
			System.out.println("'M' Masculino");
			System.out.println("Para encerrar pressione 'n'.");
			
			menu = tc.next().charAt(0); 
			
			
			
			switch (menu) {
			case 'F':
			case 'f':
				pesoIdeal = calcularFeminino(tc); 
				break;
				
			case 'M':
			case 'm':
				pesoIdeal = calcularMasculino(tc); 
				break;
			case 'n':
			case 'N':
				System.out.println("Programa encerrado!");
				break;
			default:
				
				System.out.println("Opção Inválida!");
				break;			
				
			}
			if (menu == 'F' || menu == 'f') {
				System.out.println("Peso Ideal Feminino:  " + pesoIdeal);
			} 
			if (menu == 'M' || menu == 'm') {
				System.out.println("Peso Ideal Masculino:  " + pesoIdeal);
			}
		}
	}
		private static double calcularFeminino(Scanner tc) {
			System.out.println("Informe sua altura: ");
			double peso = tc.nextDouble(); 
			double pesoIdeal = (62.1 * peso) - 44.7;
			return pesoIdeal;
		}
		
		private static double calcularMasculino(Scanner tc) {
			System.out.println("Informe sua altura: ");
			double peso = tc.nextDouble(); 
			double pesoIdeal = (72.1 * peso) - 58;
			return pesoIdeal;
		}
}
