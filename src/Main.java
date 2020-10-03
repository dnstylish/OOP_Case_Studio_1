import modules.Helper;
import modules.MyClass;
// import modules.Helper as Controller;

public class Main extends Helper {

  public static void main(String[] args) {
    try {
      MyClass myClass = new MyClass();
      int[] array = myClass.getMyArray();
      myClass.print();
      if (array.length > 3) {
        array[3] = 10;
      }
      myClass.print();
      myClass.sort();
      myClass.print();
      myClass.search();
      myClass.checkTwoArray();
    } catch (Throwable $e) {
      System.out.print("Chương trình đã dừng vì đầu vào không hợp lệ");
    }
  }
}
