public class findperfectsquare {
    public static void main(String[] args) {
        int arr[]={3,2,4,25,36,7,5};
          int sq=0;
          if(arr[0]==1){
            return;
          }
        for(int i=0; i<arr.length; i++){
            sq=arr[i]*arr[i];

            for(int j=0; j<arr.length; j++){
                if(arr[j]==sq){
                    System.out.println(arr[j]);
                }
            }
              


        }


    }
    
}
