import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        try {
            inputAll();
        }catch (Exception e){
            System.out.println("An Errror!!"+e.getMessage());
        }
    }
    public static void inputAll(){
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("enter an integer: ");
            int intValue=input.nextInt();
            System.out.println("enter a double: ");
            double doubleValue=input.nextDouble();
            System.out.println("enter an character: ");
            char charValue=input.next().charAt(0);
            System.out.println("enter boolean(true or false): ");
            boolean boolValue=input.nextBoolean();
        }catch (Exception e){
            System.out.println("An Error!!"+e.getMessage());

        }
    }
}
