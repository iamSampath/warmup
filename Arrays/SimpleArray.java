/*
   Author: Sampath Kumar Medarametla
   Description: This Program Explains how to define a Simple Array in 1D,2D,3D
*/
import java.util.*;
public class SimpleArray{

  public static void main(String[] args){

    //Single dim Array Initialization with value assignment
    int [] singleDimArray = {0,1,2,3,4,5};
    System.out.println(singleDimArray.length);

    //Single dim Array with default Initialization
    int []singleDimArrayInit = new int[6];
    System.out.println(singleDimArrayInit.length);

    // DoubleDimArray with value Initialization
    int [][] doubleDimArray = {{1,2,3},{4,5,6}};
    System.out.println(doubleDimArray.length);


    //Double dim Array with default Initialization and no assignment
    int [][]doubleDimArrayInit = new int[2][3];
    System.out.println(doubleDimArrayInit.length);

  }
}
