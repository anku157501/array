// { Driver Code Starts
//Initial Template for C++



#include <iostream>
using namespace std;



 // } Driver Code Ends


//User function Template for C++

// Complete this function
int sumOfDigits(int n)
{
    if(n==0)
    return 0;
    return sumOfDigits(n/10)+n%10;
    //Your code here
}

// { Driver Code Starts.


int main() {
	int T;
	cin>>T;
	while(T--)
	{
	    int n;
	    cin>>n;
	    
	    cout<<sumOfDigits(n)<<endl;
	    
	    
	}
	return 0;
}  // } Driver Code Ends
