import modules.MyClass;

public class Main {

    public static void main(String[] args) {
      int[] array = {1, 3, 5, 7, 9};
      MyClass myClass = new MyClass(array);
      myClass.print();
      array[3] = 10;
      myClass.print();
      myClass.sort();
      myClass.print();
    }
}
