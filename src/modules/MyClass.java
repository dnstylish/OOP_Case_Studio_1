package modules;
import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
  private int[] myArray;
  public MyClass(int[] myArray) {
    this.myArray = new int[10];
    this.myArray = myArray;
  }

  public void print() {
    System.out.println("Mảng hiện tại là:");
    for (int j : this.myArray) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  public void sort() {
    for (int i = 0; i < this.myArray.length - 1; i++) {
      for (int j = i+1; j < this.myArray.length ; j++) {
        if (this.myArray[i] < this.myArray[j]) {
          this.myArray[i] += this.myArray[j];
          this.myArray[j] = this.myArray[i] - this.myArray[j];
          this.myArray[i] -= this.myArray[j];
        }
      }
    }
    System.out.println("Đã hoàn thành việc sắp xếp");
  }

  public void search() {
    Scanner scanner = new Scanner(System.in);
    int atom;
    try {
      System.out.print("Nhập giá trị cần tìm kiếm ");
      atom = scanner.nextInt();
    } catch (Throwable $e) {
      System.out.print("Tham số không hợp lệ");
      return;
    }
    for (int i = 0 ; i < this.myArray.length ; i++) {
      if (this.myArray[i] == atom) {
        System.out.println("Mảng tồn tại giá trị " + atom + ". Tại ví trí index = " + i);
        break;
      }
    }
  }
  public void checkTwoArray() {
    System.out.println("So sánh hai mảng");
    int[] array = Controller.inputArrayNumber();
    boolean check = Arrays.equals(array, this.myArray);
    System.out.println("Mảng vừa nhập " + (check ? "giống" : "không giống") + " với mảng đã sắp xếp");
  }
}
