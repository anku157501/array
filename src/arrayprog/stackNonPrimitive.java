package arrayprog;

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Student{
     int roll;
     String stname;
    Student(int r,String s){
    roll=r;
    stname=s;
    }
    public String toString(){
        return roll+" "+stname;
    }

}
class Mystack2{
int top;
int size;
Student s[];
Mystack2(int si){
top=-1;
size=si;
s=new Student[si];
}
void push(Student student){
    if(!isfull()){
        s[++top]=student;
    }

}
Student pop(){
    return s[top--];
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

public class stackNonPrimitive {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("size");
        int s = Integer.parseInt(b.readLine());
        Mystack2 m = new Mystack2(s);
        Student st[] = new Student[s];
        System.out.println("details");
        for (int i = 0; i < s; i++) {
            int r = Integer.parseInt(b.readLine());
            String s1 = b.readLine();
            st[i] = new Student(r, s1);
        }
        for (int i = 0; i < s; i++) {
            m.push(st[i]);

        }
        if (m.isempty()) {
            System.out.println("empty stack");
        } else {
            for (int i = 0; i < s; i++) {
                System.out.println(m.pop());
            }
        }

    }
}