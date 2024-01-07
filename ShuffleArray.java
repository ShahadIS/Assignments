import java.util.Random;

public class ShuffleArray {
    /*
    Write a method, shuffle(A), that rearranges the elements of array A so that every possible ordering is
    equally likely. You may rely on the nextInt(n) method of the java.util.Random class, which returns a
     random number between 0 and n−1 inclusive.

    اكتب طريقة ، خلط ورق اللعب (A) ، تعيد ترتيب عناصر المصفوفة A بحيث يكون كل ترتيب ممكن متساويا في الاحتمال.
     يمكنك الاعتماد على طريقة nextInt(n) للفئة java.util.Random ، والتي ترجع رقما عشوائيا بين 0 و n−1 ضمنا.

     */
    public static void shuffle(int[] A) {
        Random random = new Random();

        for (int i = A.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap A[i] with A[j]
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        ShuffleArray.shuffle(A);

// Print the shuffled array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}