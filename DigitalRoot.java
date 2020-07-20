//Iterative method of finding the digital root in java

public class Main
{
	public static void main(String[] args) {
	    int n=99999,s=0;//can change the value of n bcoz i took in static
	    while(n!=0){
	        s=s+n%10;
	        n/=10;
	        if(n==0&&s>10)
	        {n=s;s=0;}
	    }
		System.out.println(s);
	}
}
