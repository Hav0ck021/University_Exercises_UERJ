#include <stdio.h>

void sumArrayNum(int *num) {
    int A[5], sum = 0;
    for(int k = 0; k < 5; k++){
        A[k] = *num % 10;
        *num = *num / 10;
        sum += A[k];
    }
    printf("%d\n", sum);
}

int main() {

    int n;
    scanf("%d", &n);

    sumArrayNum(&n);

    return 0;
}