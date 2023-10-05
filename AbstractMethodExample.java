abstract class Calculator{
   abstract void  display();
}
  class Add extends Calculator
{
    void display()
{
   System.out.println("In the Add Child Class");
}
}
  class Sub extends Calculator
{
   void display()
{
System.out.println("In the Sub Child Class");
}
}
class AbstractMethodExample
{
  public static void main(String[] abc)
  {
    Calculator obj1=new Add();
    obj1.display(); 
    Calculator obj2=new Sub();
    obj2.display(); 
     
}
}