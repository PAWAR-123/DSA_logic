public class removeduplicate {
    public static void main(String[] args) {
     int arr[]={1,2,3,2,4,5,4};
     int sum=0;
     int n=arr.length;
     for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
           if(arr[i]==arr[j]){

            for(int k=j; k<n-1; k++){
                arr[k]=arr[k+1];

            }
            n--;
            j--;

           
           }

        }



     }
     for(int i=0; i<n; i++){
       sum=sum+arr[i];
     }
     
     System.out.println("After removing sum of the array is "+sum);
    }

}
