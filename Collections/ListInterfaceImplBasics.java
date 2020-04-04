/*   Author: Sampath Medarametla
 *   This program will illustrate the basic opertations of the List Interface elements
 *   ArrayList, LinkedList, Vector, Stack
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class ListInterfaceImplBasics{


    static void getSize(List<String> str){
        System.out.println("The Size of the ArrayList is " + str.size());
    }

    static void printArrayList(List<String> str){
        for (String st : str) {
            System.out.print(st +"\t");
        }
    }

    static void containsData(List<String> str, String searchString){
        System.out.println(str.contains(searchString));
    }

    static void isEmptyList(List<String> lst){
        System.out.println(lst.isEmpty());
    }

    static void removeElement(List<String> lst, int pos){
        System.out.println(lst.remove(pos));
    }

    public static void main(String[] args){
        List<String> str = new ArrayList<String>();
        str.add("Sampath");
        str.add("Kumar");
        str.add("Medarametla");
        str.add(2,"Application");
        System.out.println("########## Added elements ##########");
        printArrayList(str);
        System.out.println();
        str.set(2, "Modified by set");
        getSize(str);
        System.out.println("########## Remove 2nd Element ##########");
        printArrayList(str);
        System.out.println();
        containsData(str,"Sampath");
        containsData(str,"Sampat");
        System.out.println("########## Check if list is empty ##########");
        isEmptyList(str);
        str.clear();
        System.out.println("########## Cleared all elements ##########");
        printArrayList(str);
        isEmptyList(str);

    }
}