public class ArrayShuffler {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array: ");
        printArray(array);

        shuffleArray(array);

        System.out.println("\nShuffled array: ");
        printArray(array);
    }

    private static void shuffleArray(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int randIndex = (int) (Math.random() * (i + 1));

            int temp = array[i];
            array[i] = array[randIndex];
            array[randIndex] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
