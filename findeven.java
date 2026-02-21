public class findeven {
public static void main(String args[]){
int arr[]={1,2,3,4,5,8,1};
//fnd the even number sun n tha array elements
//odd number of sum of in array 
int sum=0; 
for(int i=0; i< arr.length; i++){
     if(!(arr[i]%2==0)){
        sum=sum+arr[i] ;
     }

}
System.out.println("even number sum "+sum);


}
    
}
