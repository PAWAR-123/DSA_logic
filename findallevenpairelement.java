public class findallevenpairelement{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9};
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]%2==0){
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                }
 

            }
        }

    }
   
}
