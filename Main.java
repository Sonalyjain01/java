import java.util.*;
class TwentyOne
{
public void displayInfo()
{
System.out.println("I am an animal");
}}
class Dog extends TwentyOne
{
public void displayInfo()
{
System.out.println("I am a Dog");
}}

class Main
{
public static void main(String[] abc)
{
Dog d1=new Dog();
d1.displayInfo();
}
}

