/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
import java.util.Locale;
public class Exercício_While3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int alcohol, diesel, gas;
		alcohol = 0;
		diesel = 0;
		gas = 0;
		int type = sc.nextInt();
		while (type != 4){
		if 	(type == 1) {
			alcohol += 1;
		}
		else if (type == 2) {
			diesel += 1;
		}
		else if (type == 3) {
			gas += 1;
		}
		type = sc.nextInt();
		
		}
		System.out.printf("MUITO OBRIGADO%nAlcohol: %d%n Diesel: %d%nGas: %d%n", alcohol, diesel, gas);
}
}