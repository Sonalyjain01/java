abstract class MyClass{
public void disp(){
System.out.println("Concrete method of parent class");
}
abstract public void disp2();
}
class Demo extends MyClass{
public void disp2()
{
System.out.println("overriding abstract method");
}
public static void main(String[] abc)
{
Demo obj=new Demo();
obj.disp2();
obj.disp2();
}
}