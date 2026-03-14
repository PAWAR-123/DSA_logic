import java.util.Scanner;

public class sortbyFrequency {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int freq[]=new int[3];

    for(int i=0; i<n; i++){
        int x=sc.nextInt();
        freq[x]++;
    }
   
    for(int i=0; i<3; i++){
        for(int j=0; j<freq[i]; j++){
            System.out.print(i+" ");
            
        }
    }
}    
    
}
