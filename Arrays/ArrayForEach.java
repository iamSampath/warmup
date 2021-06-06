public class ArrayForEach {

    public static void main(String[] args){

        int[] arrInt = {1,2,3,4,5,6};
        String [] arrStr = {"S","A","M","P","A","T","H"};
        float [] arrFlt = {1.3f,2.65f,8.34f,7.90f};

             for (int varInt:arrInt) { System.out.print(varInt + " ");}
            for (String varStr:arrStr) { System.out.print(varStr + " ");}
            for (float varFlt:arrFlt) { System.out.print(varFlt + " ");}

    }
}
