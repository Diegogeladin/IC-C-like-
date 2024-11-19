#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> pilha; // Pilha para armazenar os números válidos

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;

        if (x == 0 && !pilha.empty()) {
            // Remove o último número válido (desempilhar)
            pilha.pop_back();
        } else if (x != 0) {
            // Adiciona o número na pilha (empilhar)
            pilha.push_back(x);
        }
    }

    // Calcula a soma dos números na pilha
    int soma = 0;
        
        for (int num : pilha) {
        soma += num;
    }

    cout << soma << endl; // Saída final
    return 0;
}
