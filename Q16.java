public class Q16 {
    public static String removePunctuation(String s){
        StringBuilder sB=new StringBuilder();
        for (char c:s.toCharArray()
             ) {
            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)){
                sB.append(c);
            }
        }
        return sB.toString();
    }

    public static void main(String[] args) {
        String givenString="Let's try , Mike!";
        String finalString=removePunctuation(givenString);
        System.out.println("the original string: "+givenString);
        System.out.println("string after modification: "+finalString);

    }
}
