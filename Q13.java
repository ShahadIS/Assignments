public class Q13 {
    public static int sumOddPositive(int n){
        int total=0;
        for (int i = 1; i <=n ; i++) {
            if(i%2!=0){
                total+=i;
            }

        }
        return total;
    }
    public static void main(String[] args) {

        System.out.println(sumOddPositive(4));
    }

}
