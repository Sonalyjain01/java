import java.util.*;
public class fact
{
public static void main(String[] agrs)
{
int fact=1;
Scanner b=new Scanner(System.in);
System.out.println("enter the number");
int n=b.nextInt();
for(int i=1; i<=n; i++)
{
fact=fact*i;
}
System.out.println("factorial:"+fact);
}
}

