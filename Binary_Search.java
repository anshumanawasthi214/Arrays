public class Binary_Search {
    public static int Binary(int a[],int key){
        int start=0;
        int end=a.length-1;
       while(start<=end){
        int mid=(start+end)/2;
       
        if(a[mid]==key){
           return mid;
        }
        if(a[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
            return -1;
        
    }

    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14};
        int key=2;
        System.out.println(Binary(a, key));
        
    }
}
