#include <stdio.h>
 
int main() {
 
    int x, n = 0, a = 0, b = 0, c = 0, d = 0;
 
    while (n < 5) {
        scanf("%d", &x);
        if (x > 0) {
            a++;
        } else {
            if (x != 0) {
                b++;
            }
        }
        if (x % 2 == 0) {
            c++;
        } else {
            d++;
        }
        n++;
    }
    printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n", c, d);
    printf("%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", a, b);
 
    return 0;
}