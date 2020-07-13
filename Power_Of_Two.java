public class Main
{
	public static void main(String[] args) {
	    int n=3;//you can take any no which is power of two or odd
	    while(n!=1){
	        if(n%2==0){
	            n=n/2;
	        }
	        else
	            break;
	    }
	    if(n==1)
		System.out.println("YES");
		else
		System.out.println("NO");

		
	}
}


//////////////////////////////////////////////////////////////OR
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
    	System.out.println(cal(n));
	}
    	public static boolean cal(int n){
    	    if(n==0)
    	    return false;
    	    while(n!=1){
    	        if(n%2!=0)
    	        return false;
    	        n/=2;
    	    }
    	    return true;
    	} 
	
}
