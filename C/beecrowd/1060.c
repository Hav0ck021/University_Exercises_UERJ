#include <stdio.h>
 
int main() {
 
    int m = 0, n = 0;
    float a;
    
    while (n < 6) {
        scanf("%f", &a);
        if (a > 0) {
            m++;
        }
        n++;
    }
    printf("%d valores positivos\n", m);
 
    return 0;
}