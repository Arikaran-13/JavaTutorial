package basics;

import jdk.swing.interop.SwingInterOpUtils;

public class Demo {
    public static void main(String[] args) {
        int a = 3;
        int b=0;    // b>0
        //if - else // condition
        // if - else if()
        // nested  if

        /*if(condition){ condition = true
            //body
        }
        else{ condition = false
            //code
        }*/
       // System.out.println(a/b);
        if(b>0) {//b>0
            System.out.println(a / b);
        }
        else{//b=0
            //System.out.println("please check your denominator ");
        }
        //a >0 a<0 , a==0
        if(a>0){
            System.out.println("+");
        }
        else if(a<0){
            System.out.println("-");
        }
        else{ //a==0
            System.out.println("zero");
        }
        //nested if

        if(a>0){
            if(a%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        else if(a==0){
            System.out.println("0");
        }
        else{
            System.out.println("-");
        }
    }
}
