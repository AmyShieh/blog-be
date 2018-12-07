import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = {12,24,7,27,32,17,35,37,45};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int number = scanner.nextInt();
    int index = Arrays.binarySearch(arr, number);
    if (index >= 0) {
      System.out.println(number+"与数组中索引为"+index+"的值相同");
    } else {
      System.out.println(number+"的值与数组中任意值都不相同");
    }
  }
}
