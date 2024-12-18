package Atividade02;
/*imprima o fatorial de um número*/
public class FATORIAL {
	public static void main (String [] args) {
		int fator = 1;
		for (int i = 3; i > 0; i--) {
			fator = fator * i;
			System.out.println(fator);
		} System.out.println("O resultado é: " + fator);
	}
}