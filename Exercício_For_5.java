import java.util.Scanner;
public class Exercício_For_5 {

	public static void main(String[] args) {
		// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1
		Scanner sc = new Scanner(System.in);
		int x = 1;
		System.out.println("Insira o número:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			x *= i;
			
			
		}
		System.out.println(x);
		sc.close();
	}
}
