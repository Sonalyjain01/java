class Baby{
int id;
String name;
Baby(int i,String n){
id=i;
name=n;
}
void display()
{
System.out.println(id+""+name);
}
public static void main(String[] anc)
{
Baby b1=new Baby(01, "Sonaly Jain");
Baby b2=new Baby(05, "Shudi Jain");
b1.display();
b2.display();
}
}

