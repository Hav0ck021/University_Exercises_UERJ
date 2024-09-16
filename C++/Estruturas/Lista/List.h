//
// Created by Caio Gabriel on 24/05/2024.
//

#ifndef C_LIST_H
#define C_LIST_H

template<typename typ>
struct Node{
    typ data;
    Node* previous;
    Node* next;
};

#endif //C_LIST_H
