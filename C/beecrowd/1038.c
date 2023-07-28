#include <stdio.h>

int main()
{
    int a, b;
    
    scanf("%d %d", &a, &b);
    
    switch(a){
        case 1:
            float precoCa = 4.00;
            precoCa *= b;
            printf("Total: R$ %.2f\n", precoCa);
            break;
        case 2:
            float precoXs = 4.50;
            precoXs *= b;
            printf("Total: R$ %.2f\n", precoXs);
            break;
        case 3:
            float precoXb = 5.00;
            precoXb *= b;
            printf("Total: R$ %.2f\n", precoXb);
            break;
        case 4:
            float torrada = 2.00;
            torrada *= b;
            printf("Total: R$ %.2f\n", torrada);
            break;
        case 5:
            float refri = 1.50;
            refri *= b;
            printf("Total: R$ %.2f\n", refri);
            break;
    }
    return 0;
}