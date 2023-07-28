#include <stdio.h>

int main() {
    int timeSec;
    int h = 0, m = 0, s;
    
    scanf("%d", &timeSec);
    
    while (timeSec != 0)
    {
        while (timeSec - 3600 >= 0){
            h++;
            timeSec -= 3600;
        }
        while (timeSec - 60 >= 0){
            m++;
            timeSec -= 60;
        }
        s = timeSec;
        timeSec = 0;
    }
    
    printf("%d:%d:%d\n", h, m, s);
 
    return 0;
}