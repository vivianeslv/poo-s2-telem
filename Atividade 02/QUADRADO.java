package Atividade02;
/*imprima um quadrado de n asteriscos*/
public class QUADRADO {
	public static void main (String [] args) {
		int tamanho = 4;
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
	}
}