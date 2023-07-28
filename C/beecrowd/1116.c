#include <stdio.h>
 
int main() {
 
    int n;
    
    scanf("%d", &n);
    
    while (n > 0)
    {
        int x, y;
        scanf("%d %d", &x, &y);
        if (y == 0){
            printf("divisao impossivel\n");
        } else {
            float k = (x/(float)y);
            printf("%.1f\n", k);
        }
        n--;
    }
    return 0;
}