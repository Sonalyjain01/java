interface printable{
void print();
}
class A6 implements printable{
public void print(){
System.out.println("I want to say something");
}
public static void main(String[] abc){
A6 obj= new A6();
obj.print();
}
}
