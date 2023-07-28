#include <stdio.h>
#include <math.h>
#define TAM 12

int main()
{
    int vet[TAM], cont;

    for (cont = 1; cont < TAM; cont+2);
        vet[cont] = cont;
        printf("%d", vet[cont]);
    return 0;
}
