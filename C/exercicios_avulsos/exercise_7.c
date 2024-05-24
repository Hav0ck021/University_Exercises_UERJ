#include <stdio.h>

int main()
{
    char nome[20],sobrenome[20];
    printf("Insira seu nome e sobrenome: ");
    scanf("%s", nome);
    scanf("%s", sobrenome);
    printf("Seu nome e sobrenome: %s, %s",sobrenome,nome);
    return 0;
}

