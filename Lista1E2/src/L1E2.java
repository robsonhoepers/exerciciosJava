import java.util.Scanner;

public class L1E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		double area = 0;
		char opcao = 0;
		double base = 0;
		double altura = 0;
		double lado = 0;
		
		while (opcao != 'n' && opcao != 'N') {
			System.out.println("Digite  'v' para calcular as areas ou 'n' para sair");
			opcao = tc.next().charAt(0);
			
			while(opcao == 'v') {
				System.out.println("Digite 'c' para Circulo, 'r' para Retangulo, 't' para Triangulo Retangulo, 'e' para Triangulo Equilatero");
				opcao = tc.next().charAt(0);
				  if (opcao == 'c') {
					  System.out.println("Digite o Raio");
					  double raio = tc.nextDouble();
	                   area = raio * raio * Math.PI;
	                   System.out.println("Area Circulo = " + area);
	                } else if (opcao == 'r') {
	                	System.out.println("Digite a Base");
	                	base = tc.nextDouble();
	                	System.out.println("Digite a Altura");
	                	altura = tc.nextDouble();
	                	area = base * altura;
	                	System.out.println("Area Retangulo = " + area);
	                } else if (opcao == 't') {
	                	System.out.println("Digite a Base");
	                	base = tc.nextDouble();
	                	System.out.println("Digite a Altura");
	                	altura = tc.nextDouble();
	                    area = (base * altura)/2;
	                    System.out.println("Area Quadrado = " + area);
	                } else if (opcao == 'e') {
	                	System.out.println("Digite o Lado");
	                	lado = tc.nextDouble();
	                    area = (lado * lado)* Math.pow(3,(1/2))/4; 
	                    System.out.println("Area Triangulo = " + area);
	                    
	                }
			}
			
		}

	}

}
