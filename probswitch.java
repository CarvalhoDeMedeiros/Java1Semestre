package exercicios;
import java.util.Scanner;
public class probswitch {
	public static void main(String[] args) {
		char letra;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma letra maiuscula: ");
		
		letra = leitor.nextLine().charAt(0);
		switch (letra) {
			case 'A':
				System.out.println("Arara");
				break;
			case 'B':
				System.out.println("Arara");
				break;
			case 'C':
				System.out.println("Arara");
				break;
			case 'D':
				System.out.println("ARARA");
				break;
			default:
				System.out.println("Não tem letra, tente outra coiosa");
				break;
		}
	}
}
