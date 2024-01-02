public class Q10 {
    public static void main(String[] args) {
        ISMultiple(40,10);
        System.out.println(ISMultiple(40,10));
    }
    public static boolean ISMultiple(long n,long m)
    {
        if(n%m==0)
            return true;
        else
            return false;

    }
}
