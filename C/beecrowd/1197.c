#include <stdio.h>

int main(){
    int v, t, s;
    /*O uso do EOF é feito para limitar a entrada de
    dados no código em questão.*/
    while (scanf("%d %d", &v, &t) != EOF) 
    {
        s = v * 2 * t;
        printf("%d\n", s);
    }
    return 0;
}