public class findfactor {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f=fact(n-1)*n;
        return f;
    }

    public static void main(String args[]){
         int result   = fact(5);
         System.out.println("factor of the number is "+result);
    }
}
//         int num=5;
//         int start=1;
//         for(int i=1; i<=5; i++){
//             start=start*i;
//         }
//         System.out.println("factor of the number is "+start);

   
//     }
    
// }
