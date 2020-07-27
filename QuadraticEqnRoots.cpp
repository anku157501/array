// { Driver Code Starts
//Initial Template for C++
/* C++ program to find roots of a quadratic equation */
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


//User function Template for C++

//You need to complete this function
void quadraticRoots(int a,int b, int c)
{int x1,x2;
   int d=(b*b)-(4*a*c);
if(d>0)   //Your code here
   {x1=floor((-b+sqrt(d))/(2.0*a));
   x2=floor((-b-sqrt(d))/(2.0*a));
   if(x1>x2)
   cout<<x1<<" "<<x2;
   else
   cout<<x2<<" "<<x1;}
   else if(d==0){
   cout<<floor((-b/(2.0*a)))<<" "<<floor((-b/(2.0*a)));
 }
 else
   cout<<"Imaginary";
   
   
   // Your don't need to printline
   // It will automatically be 
   // handled by driver code
}



// { Driver Code Starts.

int main() {
	int T; 
	cin>>T; //input number of testcases
	
	while(T--)
	{
	    int a, b, c; 
	    cin>>a>>b>>c; //Input a, b, and c
	    
	    quadraticRoots(a,b,c);
	    cout<<endl;
	    
	}
	return 0;
}  // } Driver Code Ends
