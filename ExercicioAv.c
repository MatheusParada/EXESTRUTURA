#include <stdio.h>

// Fun��o que calcula a soma de dois inteiros e retorna o resultado atrav�s de um ponteiro
void somar(int a, int b, int *resultado) {
    *resultado = a + b;
}

int main() {
    int num1, num2, resultado;

    printf("Digite o primeiro n�mero inteiro: ");
    scanf("%d", &num1);

    printf("Digite o segundo n�mero inteiro: ");
    scanf("%d", &num2);

    // Chama a fun��o somar para calcular a soma dos n�meros
    somar(num1, num2, &resultado);

    // Exibe o resultado
    printf("A soma de %d e %d � %d\n", num1, num2, resultado);

    return 0;
}

