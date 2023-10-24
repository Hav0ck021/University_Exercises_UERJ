#include <iostream>

struct tree {
    int dado;
    struct tree* esquerda;
    struct tree* direita;
};

tree* criarArvoreVazia (){
    return NULL;
}

tree* criarArvore (tree arvore; int num, tree* sae, tree* sad){
    arvore->dado = num;
    arvore->esquerda = sae;
    arvore->direita = sad;
    return arvore;
}

void imprimirArvore(){

}

int main(){
    tree arvore = new tree;
    criarArvore(10,criarArvoreVazia(),criarArvoreVazia());
    printf("%d\n",arvore.dado);
    return 0;
}
