#include <stdio.h>

int calcularValor (int *vTotal){
    int moeda[] = {2, 5, 10, 25, 50};
    int conjunto[5] ={};
    int k = 0, resto = 0;

    while (*vTotal >= moeda[0]) {
        for (int i = 4; i >= 0; i--) {
            while (*vTotal >= moeda[i]) {
                conjunto[i] += 1;
                *vTotal -= moeda[i];
            }
        }
        resto = *vTotal;
    }
    for (int i = 4; i >= 0; i--) {
        k += conjunto[i];
    }
    if (resto != 0) {
        printf("As moedas nao possibilitam a formacao do valor.\n");
    } else {
        printf("Total de moedas: %d\n", k);
    }
    return 0;
}

int main() {
  int valor;

  printf("Digite o valor em centavos: ");
  scanf("%d", &valor);

  int total = calcularValor(&valor);

  return 0;
}
