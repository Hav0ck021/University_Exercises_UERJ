#include <stdio.h>
#define PI 3.14159

int main()
{
    float a, b, c;
    float areaTri, areaCir, areaTra,areaQua, areaRet;
    
    scanf("%f %f %f", &a, &b, &c);
    
    areaTri = (a*c)/2;
    printf("TRIANGULO: %.3f\n", areaTri);
    areaCir = PI * c * c;
    printf("CIRCULO: %.3f\n", areaCir);
    areaTra = ((a + b)*c)/2;
    printf("TRAPEZIO: %.3f\n", areaTra);
    areaQua = b * b;
    printf("QUADRADO: %.3f\n", areaQua);
    areaRet = a * b;
    printf("RETANGULO: %.3f\n", areaRet);
    
    return 0;
}