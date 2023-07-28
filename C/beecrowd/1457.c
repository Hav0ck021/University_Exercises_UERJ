#include <stdio.h>
#include <string.h>

int main(){
    int qtd, t;
    char vet[200];
    
    scanf("%d", &qtd);
    
    while(qtd > 0) {
        scanf("%d %s", &t, vet);
        
        int k = strlen(vet);
        long long n = 1;
        
        for(int i = t; i > 0; i-= k){
            n *= i;
        }
        printf("%lld\n", n);
        n = 1;
        qtd--;
    }
    return 0;
}