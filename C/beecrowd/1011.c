#include <stdio.h>
#include <math.h>
#define PI 3.14159
int main(){
    double vol, raio;

    scanf("%lf", &raio);
    
    vol = (4.0/3) * PI * pow(raio, 3);

    printf("VOLUME = %.3lf\n", vol);
    return 0;
}