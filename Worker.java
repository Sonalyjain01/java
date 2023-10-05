class Worker{
int id;
String name;
void display()
{
System.out.println(id+""+name);
}
public static void main(String[] anc)
{
Worker w1=new Worker();
Worker w2=new Worker();
w1.display();
w2.display();
}
}

