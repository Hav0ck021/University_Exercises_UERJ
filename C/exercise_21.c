#include <stdio.h>

int main()
{
    int valor;
    printf("Insira um numero -> ");
    scanf("%d", &valor);

    if (valor % 2 == 0)
       printf("O numero %d e par", valor);
    else
        printf("O numero %d e impar", valor);

    return 0;
}
