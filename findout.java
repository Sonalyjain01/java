import java.util.*;
class find
{
int length, breadth, height;
public void area()

{
System.out.println("Area"+length*breadth);


}
public void volume()
{
System.out.println("volume of cuboid"+length*breadth*height);
}
public void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length");
 length=s.nextInt();
System.out.println("Enter the breadth");
 breadth=s.nextInt();
System.out.println("Enter the height");
 height=s.nextInt();}}

class findout extends find
{
public static void main(String abc[])
{
findout x=new findout();
x.input(); 
x.area();
x.volume();
}}