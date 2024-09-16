#include <stdio.h>

int returnNum(int i) {
    switch(i) {
        case 1:
            printf("one\n");
            i++;
            break;
        case 2:
            printf("two\n");
            i++;
            break;
        case 3:
            printf("three\n");
            i++;
            break;
        case 4:
            printf("four\n");
            i++;
            break;
        case 5:
            printf("five\n");
            i++;
            break;
        case 6:
            printf("six\n");
            i++;
            break;
        case 7:
            printf("seven\n");
            i++;
            break;
        case 8:
            printf("eight\n");
            i++;
            break;
        case 9:
            printf("nine\n");
            i++;
            break;
    }
    return i;
}

int main() {
    int a, b, i;
    scanf("%d %d", &a, &b);

    for(i = a; i <= b; i++) {
        if (i < 10) {
            returnNum(i);
        } else {
            if (i % 2 == 0) {
                printf("even\n");
            } else {
                printf("odd\n");
            }
        }
    }

    return 0;
}