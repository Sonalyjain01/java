interface first
{
  abstract void display();
}
interface second
{
  abstract void display();
}
 class third implements first,second
{
 public void display()
{
 System.out.println("Hello display");
}
 public static void main(String[] abc)
{
third obj=new third();
obj.display();
}
}

