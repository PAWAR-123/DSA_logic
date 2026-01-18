import java.util.Scanner;
public class SimpleInterest {
    public static int calculate( int amount,int rate, int duration ){
         int simpleInterest=(amount* rate*duration)/100;
        return simpleInterest;
    }
   public static void main(String args[]){
    System.out.println("Enter the amount ");
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt();
    System.out.println("Enter the rate ");
    int rate=sc.nextInt();
    System.out.println("Enter the duration ");
    int duration=sc.nextInt();
    System.out.println(" Simple interest of that amout is :"+calculate(amount, rate, duration));
    System.out.println("total final amount is "+(calculate(amount, rate, duration)+amount));

 sc.close();
   }
    
}

