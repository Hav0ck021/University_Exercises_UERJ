#include <stdio.h>
#include <math.h>

int main()
{
    int t;
    
    scanf("%d", &t);
    
    while (t > 0) {
        int k;
        long long int pask = 0;
        
        scanf("%d", &k);
        
        for (int i = 0; i < k; i++) {
            /*O operador de deslocamento para a esquerda em C
             é "<<". Ele recebe dois operandos: o valor a ser 
             deslocado e o número de posições que os bits devem 
             ser deslocados para a esquerda. Por exemplo, a 
             expressão x << n desloca os bits do valor x em 
             n posições para a esquerda.
            
            O uso do 1LL é referente ao deslocamento de bit
            para a esquerda. Portanto, pask recebe um numero
            em bits no qual o 1 é deslocado k vezes para 
            esquerda e é subtraido de 1.
            
            Por exemplo, se k for 3, o valor (1LL << k) - 1 
            será 7, o que em binário é 111 (três dígitos "1").
            Esse é o resultado correto para a soma da linha 3
            do triângulo de Pascal.*/
            
            pask = (1LL << k) - 1;
        }
        
        printf("%lld\n", pask);
        
        pask = 0;

        t--;
    }

    return 0;
}
