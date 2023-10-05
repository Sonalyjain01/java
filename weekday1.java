import java.util.*;
class weekday1
{
public static void main(String abc[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the day");
int day=sc.nextInt();
switch(day)
{
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invalid Entry");
}
}
}

