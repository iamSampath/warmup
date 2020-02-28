/*
    Author: Sampath Medarametla
    Program: This program will enhance on traversing in 1D, 2D and 3D arrays using loops
*/
public class SimpleArrayTraversal{

  public static void main(String[] args){

    // Single Dim Array
    int [] singleDimArray = {1,2,3,4,5,6};

    //for-each loop
    for(int element:singleDimArray){
      System.out.print(element + "\t");
    }
     System.out.println("\n");
     System.out.println("Double Dimentinal Array\n");

    //Double Dim Array
    int [][] doubleDimArray = {{1,2,3},{4,5,6}};
    for(int i=0;i<doubleDimArray.length;i++){
      for(int j=0;j<doubleDimArray[i].length;j++){
        System.out.print(doubleDimArray[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println("\n");
    System.out.println("Three Dimentinal Array\n");

    //Three Dim array
    int[][][] threeDimArray = {
      {{1,2,3},{4,5,6},{7,8,9}},
      {{10,11,12},{13,14,15},{16,17,18}},
      {{19,20,21},{22,23,24},{25,26,27}}
                             };

    for(int i=0;i<threeDimArray.length;i++){
      for(int j=0;j<threeDimArray.length;j++){
        for(int k=0;k<threeDimArray.length;k++){
             System.out.print(threeDimArray[i][j][k] + "\t");
        }
    }
    System.out.println();
  }


  }

}
