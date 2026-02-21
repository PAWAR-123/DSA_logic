public class findevennumberpair {
    public static void main(String[] args) {
    int arr[]={3,4,5,6,8,4};
    //find even number pair given in the array
    for(int i=0; i<arr.length-1; i++){

        if(arr[i]%2==0 && arr[i+1]%2==0){

        System.out.println(arr[i]+" "+arr[i+1]);

        }

    }
    
}
}

