#include <stdio.h>

int main()
{
    int x, y;
    int min, max, soma = 0;
    
    scanf("%d %d", &x, &y);
    
    if (x > y) {
        max = x;
        min = y;
    } else {
        max = y;
        min = x;
    }
    
    for (int i = (min + 1); i < max; i++){
        if (i % 2 != 0) {
            soma += i;
        }
    }
    
    printf("%d\n", soma);
    
    return 0;
}