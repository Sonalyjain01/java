interface FG{
             void learnCoding();
             void learnProgrammingLanguage();
             void contribute();
}
abstract class Student implements FG{
        public void learnCoding()
       {
         System.out.println("Let's make coding a habit");
        }
        public void learnProgrammingLanguage()
        {
         System.out.println("Let's master all fundamentals of java");
        }
 }
class G1 extends Student{
         public void contribute()
          {
         System.out.println("Now let's help others by  Teaching");
          }
}
public class Interface{
         public static void main(String[] abc)
         {
          G1 obj=new G1();
          obj.learnCoding();
          obj.learnProgrammingLanguage();
          obj.contribute();
          }
}