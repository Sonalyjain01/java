interface interface_One{
void print();
}
interface interface_Two extends interface_One{
void show();
}
interface interface_three extends interface_Two{
void scan();
}
class DemoClass  implements interface_three
{
  public void print()
    {
      System.out.println("print Democlass");
    }
  public void show()
    {
      System.out.println("show Democlass");
    }
  public void scan()
    {
      System.out.println("scan Democlass");
    }}
  class MainInterface{
  public static void main(String[] abc)
  {
   DemoClass obj=new DemoClass();
   obj.print();
   obj.show();
   obj.scan();
}
}