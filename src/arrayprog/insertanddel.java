package arrayprog;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class insertanddel {
    public static void main(String[] args)throws Exception{


    BufferedReader b =new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> ar=new ArrayList<Integer>(8);
        System.out.println("no");
//        for (Integer x:ar) {
//            x=Integer.parseInt(b.readLine());
//
//        }
        int u=Integer.parseInt(b.readLine());
        for (int i = 0; i <u ; i++) {
            int j=Integer.parseInt(b.readLine());
            ar.add(j);
        }
        System.out.println("pos and ele");
        int x=Integer.parseInt(b.readLine());
        int y=Integer.parseInt(b.readLine());

        //int t=0;
        ar.add(ar.get(ar.size()-1));
        for(int i=ar.size()-2;i>=x;i--){
           ar.set(i+1,ar.get(i));

        }
        ar.set(x,y);
        for (Integer c0:ar
             ) {
            System.out.println(c0);

        }
        System.out.println("ele");
        int t=Integer.parseInt(b.readLine());
        for (int i = 0; i < ar.size(); i++) {
            if(t==ar.get(i)){
                for (int j = i; j < ar.size()-1; j++) {
                    ar.set(j,ar.get(j+1));

                }
                break;
            }
        }ar.remove(ar.size()-1);
        for (Integer c0:ar
        ) {
            System.out.println(c0);

        }
        }
    }
