// // { Driver Code Starts
// //Initial Template for C++


// #include<bits/stdc++.h>
// using namespace std;



//  // } Driver Code Ends


// //User function Template for C++

// //You need to complete this function
// int digitsInFactorial(int N)
// {
//     long long f=1;
//     for(int i=1;i<N;i++)
//         f=f*i;
//    //cout<<f<<3;
//     return log10(f)+1;//Your code here
// }

// // { Driver Code Starts.

// int main()
// {
//     int T;
//     cin>>T;
//     while(T--)
//     {
//         int N;
//         cin>>N;
//         cout<<digitsInFactorial(N)<<endl;
//     }
//     return 0;
// }
  
// { Driver Code Starts
//Initial Template for C++


#include<bits/stdc++.h>
using namespace std;



 // } Driver Code Ends


//User function Template for C++

//You need to complete this function
int digitsInFactorial(int N)
{if(N<0)
return 0;
if(N<=1)
return 1;
    double f=0;
    for(int i=2;i<=N;i++)
      f=f+log10(i);  
    return (int)floor(f)+1;//Your code here
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

// bcoz log(a*b) = log(a) + log(b)

// Therefore
// log( n! ) = log(1*2*3....... * n) 
//           = log(1) + log(2) + ........ +log(n)

// Now, observe that the floor value of log base 
// 10 increased by 1, of any number, gives the
// number of digits present in that number.

// Hence, output would be : floor(log(n!)) + 1.
 
