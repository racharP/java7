package java7.oop.features.inheritance.package1;

/**
 * The Class DemoInh2. check inheritance with access modifier modifier
 */
public class DemoInh2
{
  public int empId = 2000; // public access every where
  private String name = "Raj"; // private access only inside class
  protected double salary = 2500000; // protected access 1 inside class 2 subclass within and without same package
  String organization = "GOOGLE Inc"; // defalut access 1 inside class and inside subclass within pckage

  public String printName()
  {
    return name;

  }
}
