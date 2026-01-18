
 public class RemoveElement {
public static void main(String args[]){
  String str = " java is great language";
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {

                // 🔒 SAFETY CHECK
                if (word.length() > 0) {

                    String revWord = "";
                    for (int j = word.length() - 1; j >= 0; j--) {
                        revWord = revWord + word.charAt(j);
                    }

                    result = result + revWord + " ";
                    word = "";
                }

            } else {
                word = word + ch;
            }
        }

        // 🔒 Reverse last word safely
        if (word.length() > 0) {

            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            result = result + revWord;
        }

        System.out.println(result);
    }
}
//     public static void main(String ab[]){ 
//         // check string is palindrome or not in java language 
//         // only one way to improve your coding and logical improvement 
//         // this only practice to improve your coding language and logic in any 
//         // any proprograming gramming language first you have face  so many problem then you 
//         // you understand the logic of
//         // you a have to improve mrnt the logic in programminfg language 
//         String str="mam asrtt java ";
//         str.chars();
    
//         int start=0;
//         int end=str.length()-1;
//         boolean falge=true;

//         for(int i=0; i<=str.length(); i++){
                  
           
//         }

//            if(falge){
//             System.out.println("string is palindrom string" +str);

//            }else{
//             System.out.println("string is not palindrome "+str);
//            }
//         // String str="vikas";
//         // String str1="";
//         // for(int i=str.length()-1; i>=0; i--){
//         //     str1+=str.charAt(i);
//         // }
//         // System.out.println(str1);
    

        
//     }
// }
//         // write a program to to find ab how many time ocuued in given string 
//         String str="abccdfabccdab";
//         str.toCharArray();
//         System.out.println(str);
//         int count =0;
//         boolean flage=false;
//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i)=='a'&& str.charAt(i+1)=='b'){
//                count++;
//                flage=true;

//             }
//         }

//         if(flage){
//             System.out.println("ab"+count);
//         }else{
//             System.out.println("not find any chrecter in string ab");
//         }
        
// }
// }
