public class selectionSort {
    public static void main(String[] args) {
        int[] price = {21, 45, 34, 23, 56, 78, 33, 67, 44, 22, 21};
        int length = price.length;

        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (price[j] < price[min]) {
                    min = j;
                }
            }
            int temp = price[i];
            price[i] = price[min];
            price[min] = temp;
        }

        // Print the sorted array
        for (int num : price) {
            System.out.print(num + " ");
        }
    }
}

