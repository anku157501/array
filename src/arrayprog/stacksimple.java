package arrayprog;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Mystack{
    int top;
    int []a;
    int size;
    Mystack(int s){
        top=-1;
        size=s;
        a=new int[size];
    }
    void push(int t){
        if(!isfull()) {
            a[++top] = t;
        }
    }
    int pop(){
        return a[top--];
    }
    boolean isfull(){
        if(top==size-1){
            return true;
        }
        return false;
    }
    boolean isempty(){

        if(top==-1){
            return true;
        }
        return false;
    }
}
public class stacksimple {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("size");
        int s = Integer.parseInt(b.readLine());
        Mystack m = new Mystack(s);
        System.out.println("elemnts");
        for (int i = 0; i < s; i++) {
            m.push(Integer.parseInt(b.readLine()));

        }
        if (m.isempty()) {
            System.out.println("empty stack");
        } else {
            for (int i = 0; i < s - 1; i++) {
                System.out.println(m.pop());
            }
        }

    }
}

