#include <stdio.h>

int main()
{
    int dist;
    float combust, media;
    
    scanf("%d", &dist);
    scanf("%f", &combust);
    
    media = dist/combust;
    
    printf("%.3f km/l\n", media);
    
    return 0;
}