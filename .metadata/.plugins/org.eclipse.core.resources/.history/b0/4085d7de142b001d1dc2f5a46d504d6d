import java.util.Scanner;

public class L1E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


	Scanner tc = new Scanner(System.in);
	
	
	double somaNota = 0;
	double contNota= 0;
	char opcao = 't';
	
	while (opcao != 's' && opcao != 'S') {
		System.out.println("Digite  'c' para calcular ou 's' para sair");
		opcao = tc.next().charAt(0);
		
		while (opcao == 'c') {	
			System.out.println("Informe a Nota do aluno ou -1 para sair. ");
			double nota = tc.nextDouble();
			
			if(nota >=0 && nota <=10) {
			   somaNota = somaNota + nota;
			   contNota++;
			} else if(nota == -1) {
				opcao = 't';
			} else {
				System.out.println("Nota Inválida...");
			}
			
		}
		if(opcao != 's' && opcao != 'S') {
			double mediaNota = (somaNota / contNota);
			System.out.println("Média = " + mediaNota);
			contNota = 0;
			somaNota = 0;
		}
	}
		System.out.println("Programa Finalizado!");
	}
	
}	