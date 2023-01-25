import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        sortAndLog(arr);
    }

    public static void sortAndLog(int[] arr) {
        try {
            File logFile = new File("sort_log.txt");
            FileWriter writer = new FileWriter(logFile);

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.write("Iteration " + (i + 1) + ": " + Arrays.toString(arr) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
