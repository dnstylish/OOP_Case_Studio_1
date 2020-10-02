package modules;

import java.util.Scanner;

public class Controller {
  public static int[] inputNumber()  {
    Scanner scanner = new Scanner(System.in);
    int count;
    System.out.print("Nhập độ dài của mảng ");
    count = scanner.nextInt();
    while (count == 0) {
      System.out.print("Độ dài của mảng không hợp lệ...nhập lại ");
      count = scanner.nextInt();
      System.out.println();
    }
    int[] array = new int[count];
    System.out.println("Mời nhập dữ liệu...");
    for (int i = 0; i < count ; i++) {
      System.out.print("\n Nhập giá trị " + i + " = ");
      array[i] = scanner.nextInt();
    }
    System.out.println("Nhập mảng thành công");
    return array;
  }
}
