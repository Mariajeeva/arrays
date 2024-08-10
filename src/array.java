import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int arr[];
        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

