public class Reverse {
    public static void rev(int a[]){
        int first=0;
        int last=a.length-1;
        while(first<=last)
        {
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8};
        rev(a);
       
    }
}
