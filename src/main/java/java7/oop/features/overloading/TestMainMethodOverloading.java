package java7.oop.features.overloading;

public class TestMainMethodOverloading
{

  public static void main(String[] args)
  {
    System.out.println("InMain");
    main(10);
  }

  public static void main(int a)
  {
    System.out.println(a);
  }

}
