/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
 */
import java.util.Locale;
public class Exercício_While1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int i;
		System.out.println("Digite a sua senha");
		i = sc.nextInt();
				while (i != 2002) {	
		System.out.println("Senha invalida");
		i = sc.nextInt();
				}
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
