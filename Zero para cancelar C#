using System;
using System.Collections.Generic;

class Program {
    static void Main() {
        int n = int.Parse(Console.ReadLine()); // Lê o número total de entradas
        Stack<int> pilha = new Stack<int>(); // Pilha para armazenar os números válidos

        // Lê os números um por um
        for (int i = 0; i < n; i++) {
            int x = int.Parse(Console.ReadLine());

            if (x == 0 && pilha.Count > 0) {
                // Se o número é zero, remove o último número da pilha (desempilha)
                pilha.Pop();
            } else if (x != 0) {
                // Se o número é diferente de zero, adiciona na pilha (empilha)
                pilha.Push(x);
            }
        }

        // Calcula a soma dos números restantes na pilha
        int soma = 0;
        foreach (int num in pilha) {
            soma += num;
        }

        Console.WriteLine(soma); // Exibe o resultado final
    }
}
 
