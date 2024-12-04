package introducao;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main(String[] args) {
		
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		fahrenheit = temperatura * 1.8f + 32;
		
		System.out.println("A temperatura em Fahrenheit é %1.f: " + fahrenheit);
		
	}

}
