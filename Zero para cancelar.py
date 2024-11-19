n = int(input())  # Lê o número total de entradas
pilha = []  # Lista usada como pilha para armazenar os números válidos

# Lê os números um por um
for _ in range(n):
    x = int(input())
    if x == 0 and pilha:
        # Se o número é zero, remove o último número da pilha (desempilha)
        pilha.pop()
    elif x != 0:
        # Se o número é diferente de zero, adiciona na pilha (empilha)
        pilha.append(x)

# Calcula a soma dos números restantes na pilha
soma = sum(pilha)
print(soma)  # Exibe o resultado final
