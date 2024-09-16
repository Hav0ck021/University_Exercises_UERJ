#include <stdio.h>
#include <math.h>

int main ()
{
    int s1, s2, s3;
    float a, t;

    scanf("%d%d%d", &s1,&s2,&s3);
    t = (s1 + s2 + s3)/2.0;
    a = sqrt(t*(t - s1)*(t - s2)*(t - s3));
    printf("%f",a);

    return 0;
}