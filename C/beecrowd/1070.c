#include <stdio.h>

int main()
{
    int a, n = 0;
    
    scanf("%d", &a);
    
    if (a % 2 == 0) {
        a -= 1;
        while (n < 6) {
            a += 2;
            printf("%d\n", a);
            n++;
        }
    } else {
        while (n < 6) {
            printf("%d\n", a);
            a += 2;
            n++;
        }
    }

    return 0;
}