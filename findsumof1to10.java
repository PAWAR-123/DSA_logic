public class findsumof1to10 {
    public static int sum(int n){
    if(n==1){
        return 1;
    }
   return (sum(n-1)+n);

}
    public static void main(String[] args) {
        System.out.println("sum of 1 to 10 number is "+ sum(10));
        
    }
    
}
