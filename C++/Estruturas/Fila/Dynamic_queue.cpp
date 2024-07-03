//
// Created by Caio Gabriel on 03/07/2024.
//

#include "Dynamic_queue.h"
#include <iostream>
#include <unistd.h>

void clearTerminalScreen() {
    #ifdef _WIN32
        system("cls");
    #else
        system("clear");
    #endif
}

bool continueProgram(){
    char option;
    std::cout << "Do you want to continue? (y/n)" << '\n';
    std::cin >> option;
    return (option == 'y' || option == 'Y');
}

void menuOptions(){
    std::cout << "Data Structure -> Dynamic Queue" << '\n'
              << "Choose an option:" << '\n'
              << "1 - Enqueue" << '\n'
              << "2 - Dequeue" << '\n'
              << "3 - Collect" << '\n'
              << "4 - Display" << '\n'
              << "5 - Exit" << '\n';
}

int main(){
    Queue<int> queue;
    bool run = true;

    while(run) {
        menuOptions();
        int option;
        std::cin >> option;

        if (option < 1 || option > 5) {
            std::cout << "Invalid option" << '\n';
            std::cin >> option;
        }

        switch (option) {
            case 1: {
                int size;
                std::cout << "Insert the size of queue" << '\n';
                std::cin >> size;
                for (int i = 0; i < size; i++) {
                    int data;
                    std::cout << "Insert a Data: ";
                    std::cin >> data;
                    queue.enqueue(data);
                }
                break;
            }
            case 2:
                if (!queue.isEmpty()) {
                    queue.dequeue();
                } else {
                    std::cout << "Queue is empty. Cannot dequeue.\n";
                }
                break;
            case 3:
                if (!queue.isEmpty()) {
                    std::cout << "Data collected: " << queue.collect() << '\n';
                } else {
                    std::cout << "Queue is empty. Cannot collect data.\n";
                }
                break;
            case 4:
                if (!queue.isEmpty()) {
                    queue.display();
                } else {
                    std::cout << "Queue is empty. Cannot display.\n";
                }
                break;
            case 5:
                run = false;
                break;
        }

        if (run) {
            run = continueProgram();
        }
        clearTerminalScreen();
    }
    return 0;
}