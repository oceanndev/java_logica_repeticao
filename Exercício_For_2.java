/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
import java.util.Locale;

public class Exercício_For_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);
int n = sc.nextInt();
int in, out;
in = 0;
out = 0;



for (int i=0; i<n; i++) {
	int x = sc.nextInt();
	if (x >= 10 && 20 <= x) {
		in = in + 1;
	}
	else {
		out = out + 1;
	}
}
System.out.println(in + " in");
System.out.println(out + " out");
	}

}
