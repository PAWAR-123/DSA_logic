import java.util.*;
public class DigitalRoot {
public static int sumDigits(int n){
    int sum=-0;
    while(n>0){
        sum+=n%10;
        n/=10;
    }
    return sum;
}
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int r=sc.nextInt();
 for(int i=0; i<r; i++){
    n=sumDigits(n);
 }
 while(n>=10){
    n=sumDigits(n);
 }
System.out.println(n);
sc.close();


    
}
  
    
}
