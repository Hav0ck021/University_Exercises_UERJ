#include <stdio.h>
 
int main() {
 
    int n;
    double k = 0.0;
    
    scanf("%d", &n);
    
    while (n > 0){
        k += 2.0;
        k = 1.0/k;
        n--;
    }
    k += 1.0;
    printf("%.10lf\n", k);
    return 0;
}