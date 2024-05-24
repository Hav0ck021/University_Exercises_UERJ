#include <iostream>
#include <string.h>

using namespace std;

bool verificarPalindromo(char *word){
    int k = 0, count = 0, len = strlen(word);
    while(count < len){
        if(word[count] == word[len - count - 1]){
            k++;
        }
        count++;
    }
    return k == len;
}

int main(int argc, char **argv){
    
    (verificarPalindromo(argv[1])) ?
    (cout << "A palavra -> " << argv[1] << " eh palindromo." << endl) : 
    (cout << "A palavra -> " << argv[1] << " nao eh palindromo." << endl);

    return 0;
}