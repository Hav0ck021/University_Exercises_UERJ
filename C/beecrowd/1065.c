#include <stdio.h>
 
int main() {
 
    int a, m = 0, n = 0;
    while (n < 5) {
        scanf("%d", &a);
        if (a % 2 == 0) {
            m++;
        }
        n++;
    }
    
    printf("%d valores pares\n", m);
 
    return 0;
}