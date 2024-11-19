import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Lê o número total de entradas

        Stack<Integer> pilha = new Stack<>(); // Pilha para armazenar os números válidos

        // Lê os números um por um
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0 && !pilha.isEmpty()) {
                // Se o número é zero, remove o último número da pilha (desempilha)
                pilha.pop();
            } else if (x != 0) {
                // Se o número é diferente de zero, adiciona na pilha (empilha)
                pilha.push(x);
            }
        }

        // Calcula a soma dos números restantes na pilha
        int soma = 0;
        for (int num : pilha) {
            soma += num;
        }

        System.out.println(soma); // Exibe o resultado final
    }
}
