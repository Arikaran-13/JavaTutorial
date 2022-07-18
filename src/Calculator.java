public class Calculator {
    public int add(int a,int b){
       int c = a+b;
       return c;
    }
    /*public void add(int a,int b){
        System.out.println( a+b);

    }*/
    public static void main(String[]args){
        int a=5;
        int b=10;

        Calculator casio = new Calculator();
       int ans = casio.add(a,b);//function call
        System.out.println(ans);
       // casio.multi(a,b);

    }
}
