public class fibonacchi {
     public static int fib(int x){

     if(x<=1){
        return x;
     }
     return fib(x-1)+fib(x-2);
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(fib(i));
        }
        
    }


}
//     public static void series(int x){
//         if(x==0){
//             return;
//         }
//         int one=0;
//         int two=1;
//         int next;
//         for(int i=1; i<=x; i++){
//            next=one+two;
//            one=two;
//            two=next;
//          System.out.println(next);
//         }
//         series(x-1);

//     }

//     public static void main(String[] args) {
//         series(10);
        
//     }
    
// }
