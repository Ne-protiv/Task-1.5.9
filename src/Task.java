import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.print(Arrays.toString(numbers));
    }
}
