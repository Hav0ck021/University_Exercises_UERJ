#include <stdio.h>
#include <math.h>

int main()
{
    int n;
    
    while (1) {
        scanf("%d", &n);
        
        if (n != 0) 
        {
            long long int total;
            
            total = (n * (n + 1) * (2*n + 1))/6;
            
            printf("%lld\n", total);
            total = 0;
            
        } else {
            break;
        }
    }
    return 0;
}