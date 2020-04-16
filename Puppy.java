import java.util.Scanner;
public class Puppy{
   public Puppy(String name){

      System.out.println("Its name : " + name );
   }
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("What's his name?");
      String str = input.nextLine();
      Puppy myPuppy = new Puppy( str );
   }
}
