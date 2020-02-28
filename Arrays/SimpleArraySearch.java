/*
 Author: Sampath Medarametla
 This Program explains about Searching through an Array using Binary Search
*/

public class SimpleArraySearch{

/*  public static boolean linearSearch(int[] arrayInput, int searchInput){

   for(int i=0;i<arrayInput.length;i++){
     if(arrayInput[i] == searchInput){
       return true;
     }
   }
   return false;
 }*/

  public static boolean binarySearch(int[] arrayInput, int key){
    return false;
  }

  public static void main(String[] args){

        int [] arr = {1,3,4,6,7,8,9,10};
        int searchInput = 10;

        //boolean result = linearSearch(arr,searchInput);
      //  boolean resultBin =  binarySearch(arr,searchInput);
      //  System.out.println(resultBin);
      /*  if(result ==  resultBin){
           System.out.println("It is good, the Results match");
        }else{
           System.out.println("It is bad, The Results didn't match");
        } */
        int low = 0;
        int high = arr.length -1;
        boolean result = false;

        System.out.println("Low = "+low + "\t" +"\tHigh = "+high);
        System.out.println("=================================");

        while(low<=high){
          int mid = (low + high)/2;
          System.out.println("Low = "+low + "\t" +"\tHigh = "+high +"\t"+"Mid = "+mid+"\tMidElement = "+ arr[mid]);
          if(searchInput == arr[mid]){
            System.out.println("The key is Found at "+mid+" Position");
            break;
          }else if(searchInput > arr[mid]){
              System.out.println("The Search Key is Higher than the mid element");
              low = mid+1;
          }else{
              System.out.println("The Search Key is lower than the mid element");
                high = mid - 1;
          }
        }
  }
}
