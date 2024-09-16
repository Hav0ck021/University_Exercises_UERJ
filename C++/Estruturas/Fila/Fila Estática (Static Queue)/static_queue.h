//
// Created by Caio Gabriel on 24/05/2024.
//

#ifndef C_STATIC_QUEUE_H
#define C_STATIC_QUEUE_H
#define MAX 100

template<typename typ>
struct Queue {
    int front, rear, size;
    typ data[MAX];
};

template<typename typ>
void createQueue(Queue<typ> *q){
    q->front = 0;
    q->rear = -1;
    q->size = 0;
}

template<typename typ>
void freeQueue(Queue<typ> *q){
    if(validate(q)){
        delete q;
    }
}

template<typename typ>
bool isEmpty(Queue<typ> *q){
    if(q == nullptr)
        return true;
    return q->front == q->rear;
}

template<typename typ>
bool isFull(Queue<typ> *q) {
    return q->size == MAX;
}

template<typename typ>
bool validate(Queue<typ> *q){
    if (isEmpty(q) == true || isFull(q) == true)
        return false;
    return true;
}

template<typename typ>
void enqueue(Queue<typ> *q, typ d){
    if(validate(q)){
        q->rear = (q->rear + 1) % MAX;
        q->data[q->rear] = d;
        q->size++;
    }
}

template<typename typ>
typ dequeue(Queue<typ> *q){
    if(!validate(q))
        return -1;
    typ d = q->data[q->front];
    q->rear = (q->rear + 1) % MAX;
    q->size++;
    return d;
}

template<typename typ>
typ collect(Queue<typ> *q){
    if(!validate(q))
        return -1;
    return q->data[q->front];
}

template<typename typ>
void display(Queue<typ> *q){
    if(validate(q)){
        printf("Queue elements:\n");
        while(q->front != q->rear){
            std::cout << q->data[q->front] << '\n';
            q->front = (q->front + 1) % MAX;
        }
        std::cout << '\n';
    }
}

#endif //C_STATIC_QUEUE_H