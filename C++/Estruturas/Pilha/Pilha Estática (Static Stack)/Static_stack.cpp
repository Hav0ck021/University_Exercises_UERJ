//
// Created by Caio Gabriel on 24/05/2024.
//

#include <iostream>
#include "Static_stack.h"

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
    std::cout << "Data Structure -> Static Stack" << '\n'
              << "Choose an option:" << '\n'
              << "1 - Push" << '\n'
              << "2 - Pop" << '\n'
              << "3 - Collect" << '\n'
              << "4 - Display" << '\n'
              << "5 - Exit" << '\n';
}

int main(){
    bool run = true;

    while(run){

    }

    return 0;
}
