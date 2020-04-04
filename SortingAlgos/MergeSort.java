import java.util.*;
class MergeSort{
    /*
        Merge sort Implementation
        Key steps
        1. Caliculate Mid Value
        2. Perform Mergesort to left Array
        3. Perform Mergesort to right Array
     */
    public static void mergesort(int[] arr){
        int []temp = new int[arr.length];
        mergesort(arr , temp, 0,arr.length-1);
    }

    public static void mergesort(int[] arr, int [] temp, int leftStart, int rightEnd){
        if(leftStart >= rightEnd){
            return;
        }

        int midValue = (leftStart + rightEnd)/2;
        //sort leftArray
        mergesort(arr, temp, leftStart, midValue);
        //sort right Array
        mergesort(arr, temp, midValue + 1, rightEnd);
        //Merge Values
        mergeValues(arr, temp, leftStart, rightEnd);
    }

    public static void mergeValues(int[] arr, int[] temp, int leftStart, int rightEnd){

        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int i = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(arr[left] <= arr[right]){
                temp[i] = arr[left];
                left++;
            }else{
                temp[i] = arr[right];
                right++;
            }
            i++;
        }

        // Copy left Array
        System.arraycopy(arr,left,temp,i, leftEnd - left + 1);
        //Copy Right Array
        System.arraycopy(arr, right, temp, i, rightEnd - right + 1);
        //Copy Complete Array from temp to the original array;
        System.arraycopy(temp,leftStart, arr, leftStart, size);

    }

    static void printMe(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args){

        int []arr = {102,10,101,101,112,130,140,10};
        mergesort(arr);
        printMe(arr);

    }
}