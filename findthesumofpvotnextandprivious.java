public class findthesumofpvotnextandprivious {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,5,7};
        int n=arr.length;
        System.out.println(arr[n/2]);
        int sum=0;
        if(n%2==0){
            for(int i=0; i<n; i++){
                sum=arr[(n/2)-2]  +arr[(n/2)+1] ;
                System.out.println(sum);
                break;

            }


        }
        
        else{

            for(int i=0; i<n; i++){
                sum=arr[(n/2)-1]+arr[(n/2)+1];
                break;
            }

                 
        } 
        
      System.out.println(sum);
    }
    
}
