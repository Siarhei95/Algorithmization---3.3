package Question_3;
import java.util.*;

public class question_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(20);
        }
        Arrays.sort(a);
        System.out.println("Array of type (a1<=a2<=a3..<=an): " + Arrays.toString(a));
        for (int i = 0; i < size; i++) {
            int max = a[i];
            int imax = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] > max) {
                    max = a[j];
                    imax = j;
                }
            }
            if (i!= imax) {
                int change = a[i];
                a[i] = a[imax];
                a[imax] = change;
            }
        }
        System.out.print("Sorted array: " + Arrays.toString(a));
    }
}


