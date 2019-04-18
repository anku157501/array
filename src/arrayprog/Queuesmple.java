package arrayprog;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyQueue{
    int front;
    int rear;
    int size;
    int total;
    int q[];

    public MyQueue(int s) {
        front=0;
        rear=0;
        total=0;
        size=s;
        q=new int[s];
    }
    void enqueue(int t){
        if(!isfull()) {
            total++;
            q[rear] = t;
            rear++;
        }
    }
    int dequeue(){

        int i=q[front];
        total--;
        front++;
        return i;

    }
    boolean isfull(){
        if(total==size){
            return true;
        }
        return false;
    }
    boolean isempty(){
        if(total==0){
            return true;
        }
        return false;
    }
    void display(){
        if(isempty()){
            System.out.println("empty queue");
        }
        else{
            for (int i = front; i <=total; i++) {
                System.out.println(q[i]);
                System.out.println(front+""+total);

            }
        }
    }
}
public class Queuesmple {
    public static void main(String[] args) throws Exception {
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("size");
    int s = Integer.parseInt(b.readLine());
    MyQueue m = new MyQueue(s);
        System.out.println("elements");
        for (int i = 0; i < s; i++) {
            m.enqueue(Integer.parseInt(b.readLine()));
        }
       // m.display();
        System.out.println(m.dequeue());
        System.out.println(m.dequeue());
        System.out.println(m.dequeue());

     //   m.dequeue();
//m.dequeue();
        }

}
