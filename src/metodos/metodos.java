package metodos;

public class metodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é: " + resultado);
		System.out.println("O segundo resultado é " + somar(8,3));
		
		falar("pode ser, Bom dia");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem();
	}
	
	public static int somar(int x, int y) {
		return x + y;
	}
	
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
