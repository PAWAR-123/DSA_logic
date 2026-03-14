public class Concatenate { // Class names should be capitalized
    public static void main(String args[]) {
        String str = "programming";
        int arr[] = new int[26];
        int result = 0;


        
        
        // Loop through the length of the STRING, not the array
        for (int i = 0; i < str.length(); i++) {
            // Increment the count for the specific character
            // We use ++arr[...] to get the updated value immediately
            result = ++arr[str.charAt(i) - 'a'];
        }
    
        System.out.println("The count of the last processed character is: " + result);
    }
}


//         // count substring using java language 
//         String str="abc";
//         int len=str.length();
//         int sub=len*(len+1)/2;
//         System.out.println(sub);

//     }
// }
//         String str="abc";
//         int len=str.length();
//         for(int i=0; i<len; i++){
//             for(int j=0; j<len; j++){

//                 for(int k=i; k<=j; k++){
//                     System.out.print(str.charAt(k));
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }


//         String str="java";
//         int len=str.length();
//         for(int i=0; i<len; i++){

//             for(int j=0; j<=i; j++){
//                 System.out.print(str.toUpperCase().charAt(j));
//             }
//             System.out.println();
//         }


//     }
// }
//      //print Each Charecter
//      String str="java";
//      int len=str.length();
//      for(int i=0; i<len; i++){
//         System.out.println(str.toUpperCase().charAt(i));
//      }


//     }
    
// }
