#include <stdio.h>
#include <stdlib.h>

int main()
{
    float sal, perc, sal_total;
    printf("Digite o salario atual: ");
    scanf("%f", &sal);
    printf("Digite o percentual de reajuste: ");
    scanf("%f", &perc);

    sal_total = sal + sal * perc;

    printf("Salario reajustado -> %.2f\n", sal_total);

    return 0;
}
