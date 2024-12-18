package Atividade02;
/*imprima os números primos até 100*/
public class PRIMOS {
    public static void main(String[] args) {
        // Passo 1: Laço para verificar cada número de 2 até 100
        for (int num = 2; num <= 100; num++) {
            boolean primo = true;  // Assumimos que o número é primo inicialmente

            // Passo 2: Verificar se o número é divisível por algum número de 2 até (num - 1)
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {  // Se o resto da divisão for 0, não é primo
                    primo = false;  // O número não é primo
                    break;  // Interrompe a verificação, pois já sabemos que não é primo
                }
            }

            // Passo 3: Se o número for primo, imprime-o
            if (primo) {
                System.out.println(num);  // Imprime o número primo
            }
        }
    }
}
