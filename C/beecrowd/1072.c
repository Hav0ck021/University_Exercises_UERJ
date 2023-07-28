#include <stdio.h>

int main()
{
    int a, n = 0, i = 0, o = 0;
    
    scanf("%d", &a);
    
    while (n < a) {
        int num;
        scanf("%d", &num);
        if (num >= 10 && num <= 20) {
            i++;
        } else {
            o++;
        }
        n++;
    }
    printf("%d in\n%d out\n", i, o);
    return 0;
}