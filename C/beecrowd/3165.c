#include <stdio.h>
#include <math.h>

int numeroPrimo(int *n){
    for(int aux = 2; aux <= sqrt(*n); aux++){
        if (*n % aux == 0 && *n != aux){
            return 0;
        }
    }
    return 1;
}

int main(){
    int n, x, y;

    scanf("%d", &n);
    
    if(n % 2 == 0)
        n--;
    
    for(int i = n; i >= 5; i-=2)
    {
        
        /*Se a função retornar o valor literal 0, o código 
        dentro do if não será executado. Isso ocorre pois
        na linguagem C a expressão "0" é interpretada como
        falsa.*/
        
        if(numeroPrimo(&i))
        {
            int k = i - 2;
            if(numeroPrimo(&k))
            {
                x = k;
                y = i;
                break;
            }
        }
    }
    printf("%d %d\n", x, y);
    return 0;
}