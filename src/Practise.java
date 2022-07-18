import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {

        int []arr={4,2,1,3}; // 2-1 =1 // 3-2=1 4-3=1
        Arrays.parallelSort(arr); //inbuild method
       //System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                System.out.println(arr[i-1]+" "+arr[i]);
            }
        }
    }
}
