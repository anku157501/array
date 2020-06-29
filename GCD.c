// GCD by Recursion 

#include <stdio.h>
int gcd(int,int);
int main()
{
    int a,b;
    scanf("%d%d",&a,&b);
    if(a<b)
    printf("%d",(gcd(b%a,a)));
    else
    printf("%d",(gcd(a%b,b)));
    return 0;
}
int gcd(int r,int a){
    if(r==0)
        return a;
    return gcd(a%r,r);
}

//GCD implement not using recursion

#include <stdio.h>
int gcd(int,int);
int main()
{
    int a,b;
    scanf("%d%d",&a,&b);
    if(a<b)
    printf("%d",(gcd(b%a,a)));
    else
    printf("%d",(gcd(a%b,b)));
    return 0;
}
int gcd(int r,int a){
    int d=-1;
    while(r!=0&&d!=0){
        d=a%r;
        a=r;
        r=d;
    }
    return a;
}
