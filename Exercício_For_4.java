import java.util.Scanner;
public class Exercício_For_4 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			double x,y, div;
			x = sc.nextDouble();
			y = sc.nextDouble();
			div = x/y;
			if (y !=0) {
				System.out.printf("%.1f%n",div);
			}
			else {
				System.out.println("Divisão impossível!%n");
			}
		}
		sc.close();

	}

}
