public class Q15 {
    public static void main(String[] args) {
        String givenString="Hi My Name is Shahad ";
        System.out.println("Number of vowels is: "+numberOfVowels(givenString));
    }
    public static int numberOfVowels(String givenString){
        int count=0;
        for (int i = 0; i <givenString.length() ; i++) {
            char Char=Character.toLowerCase(givenString.charAt(i));
            if(Char=='a' ||Char=='e' ||Char=='o' ||Char=='i' ||Char=='u' ){
                count++;
            }
        }
        return count;
    }
}
