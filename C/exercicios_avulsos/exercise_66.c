#include <stdio.h>
#include <math.h>
#define TAM 10

int main()
{
    int i, vet[TAM], x , y, cont;

    for (i = 0; i < TAM; i++)
    {
        scanf("%d", vet[i]);
        printf("\nvet[i]\n");
    }
    scanf("%d %d", &x, &y);

    cont = vet[x] + vet [y];

    printf("\n A soma é igual a -> %d", cont);

    return 0;
}
