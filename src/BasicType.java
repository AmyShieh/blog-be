import java.util.Scanner;

public class BasicType {
  public static void main(String[] args) {
    char chinaWord = '啊';
    char japanWord = 'あ';
    char you = '\u4f60';
    int position = 20320;
    byte a = (byte)128;
    byte b = (byte)(-129);
    System.out.println(a+"/"+b);
    System.out.println("汉字: "+ chinaWord+"的位置:" + (int)chinaWord);
    System.out.println("日文: "+ japanWord+"的位置" + (int)japanWord);
    System.out.println(position+"位置上的字符是"+(char)position);
    System.out.println("You:" + you);
    Scanner reader = new Scanner(System.in);
    double sum = 0;
//    double x = reader.nextDouble();
//    while( x!=0 ) {
//      sum += x;
//      x = reader.nextDouble();
//    }
    System.out.println("Sum = "+ sum);

    int[] arr1 = {1,2,3,4};
    int[] arr2 = {100,200,300};
    char[] arr3 = {'a','l','i','v','e'};
    System.out.println(arr1.length+"/arr1的引用: "+arr1);
    System.out.println(arr2.length+"/arr2的引用: "+arr2);
    System.out.println(arr3.length+"/arr3的引用: "+arr3);
    System.out.println(arr1);
    System.out.println(arr2);
    System.out.println(arr3);

    int start = 0;
    int end;
    int middle;
    int[] arr = {12,45,67,89,123,-45,67};
    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {
      for (int j = i+1; j < arrLength; j++) {
        if(arr[j] < arr[i]) {
          int t = arr[j];
          arr[j] = arr[i];
          arr[i] = t;
        }
      }
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("输入整数，程序判断该整数是否在数组中:");
    int number = scanner.nextInt();
    int count = 0;
    boolean flag = false;
//    while (count != arr.length) {
//      if(arr[count] == number) {
//        flag = true;
//        break;
//      }
//      count++;
//    }
//    if (flag) {
//      System.out.println("在");
//    } else {
//      System.out.println("不在");
//    }
    while (number != arr[count]) {

    }

    if (count > arrLength / 2) {

    } else {

    }
  }
}
