public class Q11 {
    public static boolean isEven(int i){
        return (i&1)==0;
    }

    public static void main(String[] args) {
        int i = 5;
        System.out.println(isEven(i));    }
}
