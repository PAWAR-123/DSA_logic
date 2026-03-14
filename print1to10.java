public class print1to10 {
    public static void number(int num){
           if(num==0){
            return;
           }
           number(num-1);
           System.err.println(num);
    }
    public static void main(String args[]){
        number(10);
    }
    
}
