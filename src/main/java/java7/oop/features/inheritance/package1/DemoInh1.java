package java7.oop.features.inheritance.package1;

public class DemoInh1 extends DemoInh2
{

  public static void main(String[] args)
  {

    DemoInh1 dIP1 = new DemoInh1();

    System.out.println("Name::" + dIP1.printName());
    System.out.println("EMP No:" + dIP1.empId);
    System.out.println("Salay:" + dIP1.salary);
    System.out.println("Organzation:" + dIP1.organization);
    // System.out.println("EMP No:" + dIP1.name); // Private member not accessable
  }

}
