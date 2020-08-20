// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    GP  obj=new GP ();
		    int A,B;
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    N=sc.nextInt();
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class GP 
{
    
    public double termOfGP(int A,int B,int N)
    {double r=(double)B/A;
    //cout<<r;
    double f=A*Math.pow(r,N-1);
    return f;
        //Your code here
    }

}
