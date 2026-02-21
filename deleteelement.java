public class deleteelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int valu=4;
        int n=arr.length;

        for(int i=0; i<n; i++){
          if(arr[i]==valu){

            for(int j=i; j<n-1; j++){
                arr[j]=arr[j+1];
            }
            n--;
            break;
          }


        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}
