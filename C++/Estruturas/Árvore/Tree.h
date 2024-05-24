//
// Created by caiog on 17/10/2023.
//

#pragma once
#ifndef C_TREE_H
#define C_TREE_H
#include <stdlib.h>

template <typename typ>
struct Node{
    typ data;
    Node *left;
    Node *right;
};

template <typename typ>
class Tree {
protected:
    int count = 0; // Contador de nós repetidos na árvore.
    int balance = 0; // O balanceamento pode ser 0, 1 ou -1.
private:
    Node<typ> *root;
public:
    Node<typ>* createEmpty(){
        return nullptr;
    }

    Node<typ>* create(int d) {
        Node<typ>* tree = new Node<typ>();
        tree->data = d;
        tree->left = tree->right = nullptr;
        return tree;
    }

    Node<typ> *insert(Node<typ> *tree, int d) {
        if (tree == nullptr) {
            return create(d);
        }
        if (d == tree->data)
            count++;
        if (d < tree->data) {
            tree->left = insertTree(tree->left, d);
        } else {
            tree->right = insertTree(tree->right, d);
        }
        return tree;
    }

    // Minha implementação de liberação de memória para uma árvore binária.
    Node<typ> *free(Node<typ> *tree) {
        if (tree == nullptr) {
            return nullptr;
        }
        if (tree->left->left == nullptr && tree->left->right == nullptr) {
            free(tree->left);
            tree->left = nullptr;
            freeTree(tree);
        }
        if (tree->right->left == nullptr && tree->right->right == nullptr) {
            free(tree->right);
            tree->right = nullptr;
            freeTree(tree);
        }
    }

    // Implementação apresentada em Estrutura de Dados II, da liberação de memória para uma árvore binária.
    Node<typ> *anotherFree(Node<typ> *tree) {
        if (tree != nullptr) {
            anotherFreeTree(tree->left);
            anotherFreeTree(tree->right);
            free(tree);
        }
        return nullptr;
    }

    Node<typ> *search(Node<typ> *tree, int d) {
        if (tree == nullptr) {
            return nullptr;
        }
        if (tree->data == d) {
            return tree;
        }
        if (d < tree->data) {
            return searchTree(tree->left, d);
        } else {
            return searchTree(tree->right, d);
        }
    }
};

#endif //C_TREE_H
