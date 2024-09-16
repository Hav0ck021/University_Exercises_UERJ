//
// Created by Caio Gabriel on 24/05/2024.
//

#ifndef C_STACK_H
#define C_STACK_H
#include <iostream>
#define MAX 100

template <typename typ>
class Stack{
    typ data[MAX];
    int top;
public:
    Stack(){
        top = -1;
    }

    void push(typ d){
        if (top >= MAX - 1)
            throw std::overflow_error("Stack is full.");
        data[++top] = d;
    }

    typ pop(){
        if(top < 0){
            throw std::underflow_error("Stack is empty.");
        }
        --top;
    }

    typ collect(){
        if(top < 0){
            throw std::underflow_error("Stack is empty.");
        }
        return data[top];
    }

    bool isEmpty() const {
        return top == -1;
    }

    void display(){
        for(int i = 0; i <= top; i++)
            std::cout << data[i] << " ";
        std::cout << '\n';
    }
};


#endif //C_STACK_H
