//
// Created by Caio Gabriel on 24/05/2024.
//

#pragma once
#include <iostream>
#ifndef C_QUEUE_H
#define C_QUEUE_H

template<typename typ>
struct Node{
    typ data;
    Node* next;
};

template<typename typ>
class Queue{
    Node<typ>* front;
    Node<typ>* rear;
public:
    Queue(){
        front = rear = nullptr;
    }

    ~Queue(){
        while(front != nullptr){
            Node<typ>* aux = front;
            front = front->next;
            delete aux;
        }
    }

    void enqueue(typ d){
        Node<typ>* aux = new Node<typ>;
        aux->data = d;
        aux->next = nullptr;
        if(front == nullptr){
            front = rear = aux;
        } else {
            rear->next = aux;
            rear = rear->next;
        }
    }

    void dequeue(){
        if(front == nullptr){
            std::cout << "Empty queue." << '\n';
            return;
        }

        Node<typ>* aux = front;
        front = front->next;
        std::cout << "Data: " << aux->data << " has been deleted." << '\n';
        delete aux;
    }

    typ collect(){
        if(front == nullptr){
            return -1;
        }
        return front->data;
    }

    void display(){
        Node<typ>* aux = front;
        while(aux != nullptr){
            std::cout << aux->data << '\n';
            aux = aux->next;
        }
    }

    bool isEmpty(){
        return front == nullptr;
    }

    bool isFull(){
        return false;
    }

    int size(){
        if (front == nullptr) {
            return 0;
        }

        Node<typ>* aux = front;
        int count = 0;
        while(aux != nullptr){
            count++;
            aux = aux->next;
        }
        return count;
    }
};

#endif //C_QUEUE_H