package basics;

import java.util.Scanner;

public class loopingdemo {// looping

    public static void main(String[] args) {
        int a ;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
       a= sc.nextInt();
        System.out.println(a);
        sc.nextFloat();
        sc.nextLong();
        sc.nextDouble();
        sc.nextBoolean();
        sc.nextLine(); // string
        sc.next().charAt(0); // char
    }

}
