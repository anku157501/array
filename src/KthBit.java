import java.util.Scanner;

public class KthBit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        kbit(n,k);
    }

    //by right shift operator
    public static void kbit(int n,int k){
        if(((n >> (k-1))&1)==1){
            System.out.println("SET");
        }
        else{
            System.out.println("NOT SET");
        }

    }

    //by left shift operator
//    public static void kbit(int n,int k){
//        if((n & (1<<(k-1)))!=0){
//            System.out.println("SET");
//        }
//        else{
//            System.out.println("NOT SET");
//        }
//
//    }
}
