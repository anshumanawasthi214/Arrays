import java.util.*;

public class Largest_Array {
    public static int largest(int a[]){
        int l=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>l){
                l=a[i];
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,6,5};
        System.out.println(largest(a));
    }
}
