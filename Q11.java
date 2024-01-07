import java.util.Random;

public class Q11 {
    /*
 Suppose you are given an array, A, containing 100 integers that were generated using the method r.nextInt(10),
  where r is an object of type java.util.Random. Let x denote the product of the integers in A. There is a single
   number that x will equal with probability at least 0.99.
    What is that number and what is a formula describing the probability that x is equal to that number?
    افترض أنه تم إعطاؤك مصفوفة ، A ، يحتوي على 100 عدد صحيح تم إنشاؤه باستخدام الطريقة r.nextInt (10)
     ، حيث r هو كائن من النوع java.util.Random. دع x تشير إلى حاصل ضرب الأعداد الصحيحة في A. هناك
    رقم واحد يساويه x مع احتمال 0.99 على الأقل. ما هذا العدد وما الصيغة التي تصف احتمال أن x يساوي هذا العدد؟
     */


        public static void main(String[] args) {
            Random r = new Random();
            int[] A = new int[100];

            // Generating the array A
            for (int i = 0; i < A.length; i++) {
                A[i] = r.nextInt(10);
            }

            // Calculating the product x
            long x = 1;
            for (int num : A) {
                x *= num;
            }

            // Finding the number with the highest frequency among prime factors
            int[] frequencies = new int[10];
            for (int num : A) {
                if (num == 0 || num == 1) {
                    continue; // Skip 0 and 1 as they don't contribute to the product
                }
                for (int i = 2; i <= num; i++) {
                    while (num % i == 0) {
                        frequencies[i]++;
                        num /= i;
                    }
                }
            }

            int mostFrequentNumber = 2; // Assuming 2 as the initial most frequent number
            int highestFrequency = frequencies[2];
            for (int i = 3; i < frequencies.length; i++) {
                if (frequencies[i] > highestFrequency) {
                    highestFrequency = frequencies[i];
                    mostFrequentNumber = i;
                }
            }

            // Calculating the probability that x is equal to the most frequent number
            double probability = 1 - Math.pow(0.5, 100);

            System.out.println("Most frequent number: " + mostFrequentNumber);
            System.out.println("Probability that x is equal to the most frequent number: " + probability);
        }

}
