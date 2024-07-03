//
// Created by Caio Gabriel on 24/05/2024.
//

#ifndef C_STACK_H
#define C_STACK_H

template <typename typ>
struct Node{
    typ data;
    Node *next;
};

template <typename typ>
class Stack{
    Node<typ>* top;
public:
    Stack(){
        top = nullptr;
    }

    void push(typ d){
        Node<typ>* aux = new Node<typ>;
        aux->data = d;
        aux->next = top;
        top = aux;
    }

    typ pop(){
        if(top == nullptr){
            return -1;
        }
        Node<typ>* aux = top;
        typ d = aux->data;
        top = top->next;
        delete aux;
        return d;
    }

    typ collect(){
        if(top == nullptr){
            return -1;
        }
        return top->data;
    }

    bool isEmpty(){
        return top == nullptr;
    }

    bool isFull(){
        return false;
    }
};


#endif //C_STACK_H
