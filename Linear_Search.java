import java.util.*;
public class Linear_Search{

    public static int ls(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14,16};
        int key=12;
        System.out.println(ls(a,key));
    }
}