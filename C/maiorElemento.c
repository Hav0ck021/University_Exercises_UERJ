//Crie um programa em C que peça 10 números, armazene eles em um vetor e diga qual elemento é o maior, e seu valor.
#include<stdio.h>

int main(){
	int i, aux;
  	long int num[10], maior;
  	printf("Insira os dez numeros no vetor.\n");
  	for(i = 0; i < 10; i++){
      scanf("%ld", &num[i]);
    }
  	maior = num[0];
  	for(i = 0; i < 10; i++)
  	{
    	if(maior < num[i]){
			maior = num[i];
            aux = i;
        }
    }
  	printf("O maior valor eh %ld e sua posicao é %d\n", maior , aux + 1);
  return 0;
}
