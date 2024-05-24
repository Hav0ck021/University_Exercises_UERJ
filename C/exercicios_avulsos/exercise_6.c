#include <stdio.h>

int main()
{
    int num,num1,num2;
        printf("Digite um número inteiro\n");
        scanf("%d",&num);
        num1 = num;
        num2 = num;
        num1++;
        printf("\nSucessor: %d\n",num1);
        num2--;
        printf("\nAntecessor: %d\n",num2);
    return 0;
}