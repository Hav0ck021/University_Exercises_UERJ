#include <iostream>

struct tree {
    int dado;
    struct tree* esquerda;
    struct tree* direita;
};

tree* createTree (){
    return NULL;
}

tree* createTree (tree tr; int num, tree* sae, tree* sad){
    tr->dado = num;
    tr->esquerda = sae;
    tr->direita = sad;
    return arvore;
}

void imprimirArvore(){

}

int main(){
    tree arvore = new tree.createTree();
    criarArvore(10,createTree(),createTree());
    printf("%d\n",arvore.dado);
    return 0;
}
