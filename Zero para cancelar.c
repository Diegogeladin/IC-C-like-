#include <stdio.h>

int main() {
    int n; // Quantidade de números falados
    scanf("%d", &n);
    
    int pilha[n]; // Pilha para armazenar os números válidos
    int topo = 0; // Indica o índice do topo da pilha
    
    for (int i = 0; i < n; i++) {
        int x;
        scanf("%d", &x);
        
        if (x == 0 && topo > 0) {
            // Remove o último número válido (desempilhar)
            topo--;
        } else if (x != 0) {
            // Adiciona o número na pilha (empilhar)
            pilha[topo] = x;
            topo++;
        }
    }
    
    // Calcula a soma dos números na pilha
    int soma = 0;
    for (int i = 0; i < topo; i++) {
        soma += pilha[i];
    }
    
    printf("%d\n", soma); // Saída final
    return 0;
}










