package estrutura_decisao;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("olá, digite a sua média: ");
		media = leia.nextFloat();
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovado!");
		}else {
			System.out.println("Infelizmente, você foi reprovado");
		}

	}

}
