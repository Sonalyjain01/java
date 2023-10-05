class Construct1
{
int age;
String name;
Construct1()
{
int age=0;
String name="0";
System.out.println("Default constructor:"+age+""+name);
}
Construct1(int a, String n)
{
age=a;
name=n;
System.out.println("Age="+age+"Name="+name);
}}
class Construct
{
public static void main(String[] xyz)
{
Construct1 c1=new Construct1();
Construct1 c2=new Construct1(11, "Rohan");
}
}