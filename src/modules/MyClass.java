package modules;

public class MyClass {
  private int[] myArray;
  public MyClass(int[] myArray) {
    this.myArray = new int[10];
    this.myArray = myArray;
  }

  public void print() {
    for (int j : this.myArray) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  public void sort() {
    for (int i = 0; i < this.myArray.length - 1; i++) {
      for (int j = i+1; j < this.myArray.length ; j++) {
        if (this.myArray[i] < this.myArray[j]) {
          int temp = this.myArray[j];
          this.myArray[j] = this.myArray[i];
          this.myArray[i] = temp;
        }
      }
    }
    System.out.println("Đã hoàn thành việc sắp xếp");
  }
}
