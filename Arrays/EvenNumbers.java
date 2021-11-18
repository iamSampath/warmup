public class EvenNumbers {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int temp = 0;
        int digitCounter = 0;
        int evenCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            temp = arr[i];
            while (temp != 0) {
                temp = temp / 10;
                System.out.println(temp);
                digitCounter++;
            }
            System.out.println("Digit Counter: " + digitCounter);
            if (digitCounter % 2 == 0) {
                evenCounter++;
            }
            digitCounter = 0;

        }

        System.out.println(evenCounter);

    }
}
