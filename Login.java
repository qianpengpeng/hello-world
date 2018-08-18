import java.util.Scanner;

public class Login{
   public static void main(String arg[]){
      Scanner scan = new Scanner(System.in);
      while(true){
         System.out.print("Please input your ACCOUNT:");
         String account = scan.nextLine();
         System.out.println();
         System.out.print("Please input your PASSWORD:");
         char password[] = System.console().readPassword();
         String pw = new String(password);
         if(account.equals("qianpeng3510")&&pw.equals("wqy571")){
            System.out.println("Welcome To Travelsky!");
            break;
         }else if(account.equals("q")&&pw.equals("q")){
            break;
         }
      System.out.println("Make sure your information again!");
      }
   }
}