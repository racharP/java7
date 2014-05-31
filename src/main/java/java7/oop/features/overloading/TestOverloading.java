package java7.oop.features.overloading;

/**
 * The Class TestOverloading.
 * 
 * to test java oveloading features
 * 
 * thre condition to check overloading
 * -method with diff. no of parameter
 * -method with diff parameter signature
 * -method with sequence of parameter
 */
public class TestOverloading
{

  public static void main(String[] args)
  {
    TestOverloading to = new TestOverloading();
    int integervalue = to.sum(11,10);
    double doubleValue = to.sum(1,1,1);
    System.out.println(integervalue);

    // double doubleValue = to.sum(10.5,11.5);
    System.out.println(doubleValue);
  }

  private double sum(double d, double e)
  {
    return d + e;
  }

  private int sum(int i, int j)
  {
    return i + j;
  }

  private double sum(int a, double b, int c)
  {
    System.out.println("In two");
    return a + b + c;

  }

  private double sum(int a, int b, int c)
  {
    System.out.println("In one");
    return a + b + c;

  }

}
