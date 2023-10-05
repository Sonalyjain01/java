class ThisMum{
int instvar;
ThisMum(int instvar){
this.instvar=instvar;
System.out.println("this reference="+this);
}
public static void main(String[] abc)
{
ThisMum obj=new ThisMum(8);
System.out.println("object reference"+obj);
}
}