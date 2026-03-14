function reverseString(str){
 let rev="";
 for(let i=str.length-1;i>=0;i--){
  rev += str[i];
 }
 return rev;
}

console.log(reverseString("Angular"));





// function findMax(arr){
//  let max=arr[0];

//  for(let i=1;i<arr.length;i++){
//   if(arr[i] > max){
//    max = arr[i];
//   }
//  }

//  return max;
// }

// console.log(findMax([10,25,5,40,15]));