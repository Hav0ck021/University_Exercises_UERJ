#include <stdio.h>

int main()
{
    int a , cont = 1;

    scanf("%d", &a);
    
    if (a % 2 != 0) {
        while (cont <= a) {
            printf("%d\n", cont);
            cont += 2;
        }
    } else {
        while (cont < a) {
            printf("%d\n", cont);
            cont += 2;
        }
    }

    return 0;
}