class Bike{
final void run(){
System.out.println("running");
}
class Honda extends Bike{
void run(){
System.out.println("running safely with 100kmph");
}
public static void main(String[] abv){
Honda h=new Honda();
h.run();
}
}
}