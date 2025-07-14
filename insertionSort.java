public class insertionSort {
    public static void main(String[] args) {
        int[] price = {10, 20, 56, 82, 11, 89, 43, 27, 98, 16};
        int n = price.length;

        for (int i = 1; i < n; i++) {
            int temp = price[i];
            int j = i - 1;

            while (j >= 0 && price[j] > temp) {
                price[j + 1] = price[j];
                j--;
            }

            price[j + 1] = temp; // insert temp in correct position
        }

        // Print sorted array
        for (int num : price) {
            System.out.print(num + " ");
        }
    }
}
