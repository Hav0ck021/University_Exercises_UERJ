#include <stdio.h>

int main()
{
    float F, C;
    printf("Insira a temperatura em Fahrenheit: ");
    scanf("%f", &F);
    C = 5.0*(F - 32)/9;
    printf("A temperatura em graus Celsius e igual a: %.2f",C);
    return 0;
}
