abstract class op{
abstract void sum();
};
class isum extends op
{
void sum()
{
int a,b,c;
a=10;
b=20;
c=a+b;
System.out.println("IntValue=" +c);
}
}
class fsum extends op
{
void sum()
{
float f1,f2,f3;
f1=10.26f;
f2=20.34f;
f3=f1+f2;
System.out.println("FloatValue=" +f3);
}
}
class AbDemo
{
public static void main(String[] abc){
op t=new isum();
t.sum();
op t=new fsum();
t.sum();
}
};