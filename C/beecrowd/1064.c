#include <stdio.h>
 
int main() {
 
    int m = 0, n = 0;
    float a, k = 0.0;
    while (n < 6) {
        scanf("%f", &a);
        if (a > 0) {
            k += a;
            m++;
        }
        n++;
    }
    k /= m;
    
    printf("%d valores positivos\n%.1f\n", m, k);
 
    return 0;
}