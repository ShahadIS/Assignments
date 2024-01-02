import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int element[]=new int[3];
        Scanner inputArray=new Scanner(System.in);
        for (int i = 0; i < element.length; i++) {
            System.out.println("please enter an element: ");
            element[i]=inputArray.nextInt();
        }
        System.out.println("the elements: ");
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i]+" ");

        }

}}
