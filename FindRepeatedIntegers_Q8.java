
    /*
    خوارزمية:
قم بإنشاء مجموعة S لتخزين العناصر المميزة التي تمت مواجهتها حتى الآن. تهيئة S إلى مجموعة فارغة.
كرر من خلال الصفيف B: a. لكل عنصر b في B: i. إذا لم يكن b في S، أضف b إلى S. يشير هذا إلى أن العنصر b قد شوهد مرة واحدة. ii. إذا كان b موجودا بالفعل في S ، فإن b عنصر متكرر. أضف b إلى قائمة العناصر المتكررة.
نظرا لوجود خمسة عناصر متكررة ، استمر في التكرار من خلال B حتى تجد خمسة عناصر مميزة متكررة.
قائمة العناصر المتكررة
تحليل:
تعقيد الوقت: O (n) ،
حيث n هو حجم المصفوفة B. وذلك لأن الخوارزمية تتكرر عبر المصفوفة B مرة واحدة فقط ، وتستغرق كل عملية وقتا ثابتا.
تعقيد الفضاء: O (n-5) ، حيث n-5 هو حجم المجموعة S. وذلك لأن المجموعة S تخزن بحد أقصى من العناصر المميزة n-5.

     */

import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.List;

public class FindRepeatedIntegers_Q8 {
    public static List<Integer> findRepeatedIntegers(int[] B) {
        HashSet<Integer> seenSet = new HashSet<>();
        List<Integer> repeatedElements = new ArrayList<>();

        for (int b : B) {
            if (seenSet.contains(b)) {
                repeatedElements.add(b);
            } else {
                seenSet.add(b);
            }
        }

        return repeatedElements;
    }

    public static void main(String[] args) {
        int[] B = {1, 2, 3, 4, 2, 3, 4, 5, 1, 5}; // Example array
        List<Integer> repeatedIntegers = findRepeatedIntegers(B);

        if (repeatedIntegers.size() == 5) {
            System.out.println("The repeated integers are: " + repeatedIntegers);
        } else {
            System.out.println("Could not find the five repeated integers.");
        }
    }
}
