import modules.Controller;
import modules.MyClass;
// import modules.Main as Controller;

public class Main extends Controller {

  public static void main(String[] args) {
    int[] array;
    try {
      array = inputArrayNumber();
      MyClass myClass = new MyClass(array);
      myClass.print();
      if (array.length > 3) {
        array[3] = 10;
      }
      myClass.print();
      myClass.sort();
      myClass.print();
      myClass.search();
      myClass.checkTwoArray();
    } catch (Exception $e) {
      System.out.print("Chương trình đã dừng vì đầu vào không hợp lệ");
    }
  }
}
