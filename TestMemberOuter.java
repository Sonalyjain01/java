class TestMemberOuter{
private int data=30;
class Inner{
void msg(){
System.out.println("data is" +data);
}}
public static void main(String[] abc)
{
TestMemberOuter t1=new TestMemberOuter();
TestMemberOuter.Inner in= t1.new Inner();
in.msg();
}
}