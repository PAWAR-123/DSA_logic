import java.util.Scanner;

public class Evennumber{
    public static void main(String args[]){
        //write a program to find even number 
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
           System.out.println(num+"not even number");
           sc.close();
           return;
           
        }
        if(num %2==0){
            System.out.println("even number"+num);
        }else{
       System.out.println("not even number "+num);

       
        }

 sc.close();
    }

}