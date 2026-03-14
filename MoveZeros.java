import java.util.Scanner;

public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length) {
            arr[count++] = 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        moveZeros(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
