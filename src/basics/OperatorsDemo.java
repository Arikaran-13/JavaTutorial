package basics;

public class OperatorsDemo {
    public static void main(String[]args){
        // Arithmatic operator:
        // + , - , * , / , %
        // operator => operation  // a + b //operand
        int a = 3;
        int b =9;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // 3 / 9 => 0.3
        System.out.println(a%b); // % => mod => remainder
        // relational operator
        // > , < , >= , <= , == , != // boolean
        System.out.println("--------------------------");
        System.out.println(a>b); // 3 ,9
        System.out.println(a<b);
        System.out.println(a>=b); // a>b or a ==b
        System.out.println(a<=b);// a<b or a==b
        System.out.println(a==b);
        System.out.println(a!=b);

        System.out.println("-------------------------");
        // bitwise operator
        //35 => 100011
        // and , or , not , xor
        // & , | , ! , ^

        /*   0  0   =>  0 & 0 = 0       // 1 => true , 0 => false
             1  1   => 1 & 1 = 1
             0  1   => 0
             1  0   => 0

            0 0 => 0
            1 1 => 0
            0 1 = 1
            1 0 = 1

             1 ! = 0
             0 ! =1



            */
        System.out.println(0 & 1);
        System.out.println( 9 & 3); //
        System.out.println(9 | 3);
        System.out.println("------------------------------");

        // right shift and left shift operator  // >> , <<
  a=6;
        System.out.println(a>>2); // /2  times
        System.out.println(a<<2);  // *2 * times

        System.out.println("------------------------");
        // increment or decrement operator

        int v = 4;
       // v = v+1;
        System.out.println( v++);   //post increment
        System.out.println(v);
        System.out.println("---------");
        System.out.println(++v); // pre increment
        System.out.println("-------");
        System.out.println(--v); // pre decrement
        System.out.println("-------------");
        System.out.println(v--); // post decrement




        a=9; //8//7
        b=7;//6
        int c=10;//9
        System.out.println( --a + a-- + --c + b-- + c++ ); // 8 + 8 + 9 + 7 + 9
       // v=v-1;
      //  System.out.println(v--);

// array :
/*
    int m = 100
    int s = 23.5;
    int ss= 90;
    int t=100;
    int e =99;
    // contineous mem allocation
    // int [] marks = new int[5];

*/
        // same data type
        // size should be declared at the initial stage
        System.out.println("-------------------------");
int [] marks = new int[5];
marks[0]=100;// base addrress
marks[1]=23;
marks[2]=90;
marks[3]= 100;
marks[4]=99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.hashCode());

    }
}
