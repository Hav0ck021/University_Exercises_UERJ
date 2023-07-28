#include <stdio.h>
#include <math.h>

int main()
{
    double a, b, c, delta, x;
    
    scanf("%lf %lf %lf", &a, &b, &c);
    
    delta = (b * b) - (4 * a * c);

    if (delta < 0 || a == 0){
        printf("Impossivel calcular\n");
    } else {
        delta = sqrt(delta);
        x = (-b + delta)/(2*a);
        printf("R1 = %.5f\n", x);
        x = (-b - delta)/(2*a);
        printf("R2 = %.5f\n", x);
    }
    return 0;
}