#include <stdio.h>

int main()
{
    int idade;
    int ano, mes, dia;
    
    scanf("%d", &idade);
    
    while (idade != 0)
    {
        while (idade - 365 >= 0) {
            ano++;
            idade -= 365;
        }
        while (idade - 30 >= 0) {
            mes++;
            idade -= 30;
        }
        dia = idade;
        idade = 0;
    }
    printf("%d ano(s)\n", ano);
    printf("%d mes(es)\n", mes);
    printf("%d dia(s)\n", dia);
    
    return 0;
}