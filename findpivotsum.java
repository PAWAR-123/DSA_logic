public class findpivotsum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int sum=0;
        if(n%2==0){
            return;
        }
        int  pivot=n/2;
        if(pivot>0 && pivot< n-1);
        sum=arr[pivot+1]+arr[pivot-1];
        System.out.println(sum);

    }
    
}
