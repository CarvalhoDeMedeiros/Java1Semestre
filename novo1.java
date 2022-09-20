package java.Java1Semestre;
import java.util.Scanner;

public class novo1 {
	public static void main(String[] args) {
		int numero;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número");
		numero = leitor.nextInt();
		
		if(numero>15) {
			System.out.println("O numero é muito alto");
		}else if(numero ==15) {
			System.out.println("Ideal. Parabens");
		}else {
			System.out.println("Muito baixo");
		}
	}
}
