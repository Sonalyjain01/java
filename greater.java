import java.util.*;
public class greater
{
public static void main(String[] agrs)
{
Scanner s=new Scanner(System.in);
System.out.println("enter 3 number");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b && a>c)
System.out.println("a is greater");
else if(b>c)
System.out.println("b is greater");
else
System.out.println("c is greater");
}
}
