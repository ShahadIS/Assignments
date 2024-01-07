import java.util.HashSet;
/*
في لغة جافا، `HashSet` هو نوع من هياكل البيانات التي تقدمها مكتبة جافا لتخزين مجموعة من العناصر بدون ترتيب وبدون تكرار.
 يعتمد `HashSet` على هيكلة البيانات المعروفة باسم "جدول التجزئة" (hash table) لتحقيق أداء فعال.

المفاهيم الأساسية حول `HashSet` في جافا:

- `HashSet` يتأكد من عدم وجود عناصر مكررة في المجموعة، مما يعني أنه لا يمكن تخزين نفس العنصر مرتين في `HashSet`.
- يتم تخزين العناصر في `HashSet` باستخدام وظيفة التجزئة (hash function)،
 والتي تحسب قيمة تجزئة فريدة لكل عنصر. يتم استخدام هذه القيمة لتخزين العناصر في مكان مناسب داخل جدول التجزئة.
- يتم تحقيق الوصول السريع إلى العناصر في `HashSet` بفضل استخدام جدول التجزئة.
 عند البحث عن عنصر، يتم حساب قيمة تجزئة له ومن ثم البحث عنه في المكان المقابل في جدول التجزئة.
- لا يتم تحديد ترتيب معين للعناصر في `HashSet`.
 إذا كنت بحاجة إلى تخزين العناصر بترتيب معين، يجب عليك استخدام هياكل بيانات أخرى مثل `LinkedHashSet`.

تستخدم `HashSet` في جافا في العديد من السيناريوهات، مثل إزالة العناصر المكررة من مجموعة، التحقق من الوجود أو الغياب لعنصر معين، وإزالة العناصر بفعالية وسرعة.
 */

public class FindRepeatedInteger_Q7 {
    public static int findRepeatedInteger(int[] A) {
        HashSet<Integer> seenSet = new HashSet<>();
        for (int num : A) {
            if (seenSet.contains(num)) {
                return num;
            } else {
                seenSet.add(num);
            }
        }
        return -1; // If no repeated integer is found
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 2}; // Example array
        int repeatedInteger = findRepeatedInteger(A);
        if (repeatedInteger != -1) {
            System.out.println("The repeated integer is: " + repeatedInteger);
        } else {
            System.out.println("No repeated integer found.");
        }
    }
}
    /*
    Let A be an array of size n ≥ 2 containing integers from 1 to n−1
     inclusive, one of which is repeated. Describe an algorithm for finding the integer
     in A that is repeated:

     Certainly! Here's the Java implementation of the algorithm to find the repeated integer in an array `A`:

In this implementation, we use a `HashSet` to keep track of
the integers we have encountered so far. We iterate through the array `A`, and for each element `num`,
 we check if it is already present in the `seenSet`. If it is, we return `num` as the repeated integer.
 Otherwise, we add `num` to the `seenSet`. If no repeated integer is found after iterating through
 all elements of `A`, the function returns -1.

In the `main` method, we provide an example array `A` and call the `findRepeatedInteger` method to find the repeated integer. The result is then printed to the console.
     */

