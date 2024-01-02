import java.util.Scanner;

public class Q6 {
    public static void InputArray(){
        int MyArray[]=new int[3];
        Scanner input=new Scanner(System.in);
        for (int x = 0; x < MyArray.length; x++) {
            System.out.println("please enter an element: ");
            MyArray[x]=input.nextInt();
        }
        System.out.println("the elements: ");
        for (int i = 0; i < MyArray.length; i++) {
            System.out.print(MyArray[i]+" ");

        }

    }

    public static void main(String[] args) {
        InputArray();

    }


}

