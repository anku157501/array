// { Driver Code Starts
//Initial Template for C++


#include<bits/stdc++.h>
using namespace std;



 // } Driver Code Ends


//User function Template for C++

//You need to complete this function
int digitsInFactorial(int N)
{
    long long f=1;
    for(int i=1;i<N;i++)
        f=f*i;
   //cout<<f<<3;
    return log10(f)+1;//Your code here
}

// { Driver Code Starts.

int main()
{
    int T;
    cin>>T;
    while(T--)
    {
        int N;
        cin>>N;
        cout<<digitsInFactorial(N)<<endl;
    }
    return 0;
}
  
