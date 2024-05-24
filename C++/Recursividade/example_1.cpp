//
// Created by Caio Gabriel on 09/05/2024.
//

#include <iostream>

void recurseMath(int num){
    if (num > 0){
        recurseMath(num - 1);
        std::cout << num << std::endl;
    }
    while(num > 0){
        std::cout << num << std::endl;
        num--;
        recurseMath(num);
    }
}

int main(){
    int num;
    std::cin >> num;
    recurseMath(num);
    return 0;
}