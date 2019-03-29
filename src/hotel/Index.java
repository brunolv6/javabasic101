package hotel;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Criar objeto vetor de quarto e instanciar como um hotel de 10 quartos
		Motel[] quarto = new Motel[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int quartosAlugados = sc.nextInt();
		sc.nextLine();
		int i = 0;
				
		while(i < quartosAlugados) {
			int aluguel = 0;
			do {
				System.out.println("Qual quarto deseja alugar? ");
				aluguel = sc.nextInt();
				sc.nextLine();
			} while (aluguel>11 || quarto[aluguel]!=null);
			System.out.println("Qual seu nome? ");
			String nome = sc.nextLine();
			System.out.println("Qual seu email? ");
			String email = sc.nextLine();
			quarto[aluguel] = new Motel(nome, email);
			i++;
		}
		
		//i = 0;
		
		while(i<10) {
			if(quarto[i]!=null) {
				System.out.printf("O quarto %d foi alugado por ", i);
				System.out.println(quarto[i]);
				i++;
			}
		}
	}

}






