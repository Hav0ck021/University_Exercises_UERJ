//Por algum motivo, essa solução não funciona no Beecrowd
#include <stdio.h>

int main(){
    int cod, numPecas, i = 0;
    double valor, total;

    while(i < 2)
    {
        scanf("%d %d %lf", &cod, &numPecas, &valor);
        total += numPecas * valor;
        i++;
    }
    printf("VALOR A PAGAR: R$ %.2lf\n", total);
    return 0;
}