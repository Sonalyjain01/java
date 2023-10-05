class This
{
int a,b;
This(int a, int b)
{
this.a=a; this.b=b;
}
void display()
{
System.out.println("a="+a+"b="+b);
}
public static void main(String[] anc)
{
This obj=new This(56,12);
obj.display();
}}