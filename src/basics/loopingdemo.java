package basics;

import java.util.Scanner;

public class loopingdemo {// looping

    //repeat
    // tamil mark is 100
    //eng mark 100
    //math mark =78
    // looping : for loops , while loop , do while loop
    // do below steps for 5 times , int count=0;
    //Scanner sc = new Scanner(System.in);
    // int marks = sc.nextInt(); // mark storing
    //print(marks);
    //count++;
    /*

    while(condition){ condition = true
// for loops:

for(int count=0;count<5;count++){
// initialisation , condition checking , increment or decrement operator

//body
}

// do while loop

do{
//body  // atleast one time
}while(condition);


    }

*/
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        int mark;
        while (count < 5) {

            System.out.println("Enter the subject marks: ");
            mark = sc.nextInt(); // mark store
            System.out.println(mark);
            count++;

        }
        for( count=0;count<5;count++){
            System.out.println("Enter the subject marks: ");
            mark = sc.nextInt();
            System.out.println(mark);
        }
count=6;
  do{
      System.out.println("Enter the mark: ");
      mark= sc.nextInt();
      System.out.println(mark);
      count++;
  }while(count<5);


    }

}
