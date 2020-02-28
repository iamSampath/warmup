/*
   Author: Sampath Kumar Medarametla
   This Program represents the Search of Arrays using
*/
public class SimpleArraySearchMod{

public static boolean linearSearch(int[] arrInput, int key){
  for(int i=0;i<arrInput.length;i++){
    if(key == arrInput[i]){
      return true;
    }
  }
  return false;
}

public static boolean binarySearch(int[] arrInput, int key)
{
  int low = 0, high = arrInput.length - 1;
  while(low<=high){
    int mid = (low + high)/2;
    if(key == arrInput[mid]){
      return true;
    }else if(key > arrInput[mid]){
        low = mid+1;
    }else{
          high = mid - 1;
    }
  }
  return false;
}

  public static void main(String[]args){

    int [] arr = {2,5,7,9,10,12,15,23};

    System.out.println("Linear Search ======>");
    System.out.println(linearSearch(arr,20));
    System.out.println(linearSearch(arr,5));

    System.out.println("Binary Search ======>");
    System.out.println(binarySearch(arr,20));
    System.out.println(binarySearch(arr,5));
  }
}
