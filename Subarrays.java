public class Subarrays {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("( ");
                for(int k=i;k<j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.print(")");
                System.out.println();
            }
        }
    }
}
