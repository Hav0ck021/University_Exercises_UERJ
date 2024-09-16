cmake_minimum_required(VERSION 3.27)
project(C__)

set(CMAKE_CXX_STANDARD 14)

include_directories(Estruturas/Árvore)
include_directories(Estruturas/Fila)

add_executable(C__
        Estruturas/Árvore/Tree.h
        "Estruturas/Fila/Fila Dinâmica (Dynamic Queue)/Dynamic_queue.h"
        "Estruturas/�rvore Bin�ria/BinaryTree.cpp"
        Exemplos/palindromo.cpp
        Recursividade/example_1.cpp
        Estruturas/Árvore/Tree.h
        Estruturas/Árvore/Tree.h)
