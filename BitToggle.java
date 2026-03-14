import java.util.Scanner;

public class BitToggle {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int bitlen=Integer.SIZE-Integer.numberOfLeadingZeros(n);
int mask=(1<<bitlen)-1;
System.out.println(n^mask);
sc.close();




}
    
}
