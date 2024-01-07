
    //Write a Java method that repeatedly selects and removes a random
    // entry from an array until the array holds no more entries.

import java.util.Random;

public class RandomArrayRemoval_Q2 {

    public static void main(String[] args) {
        // Example usage
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       //خلط وازالة
        shuffleAndRemove(array);
    }
    /*
    تبديل عناصر مصفوفة وإزالة عنصر واحد عشوائيًا:

    1. تم إنشاء كلاس المساعدة `shuffleAndRemove` مع
    تعريفه كـ Generic Method باستخدام `<T>`. يتلقى هذا الكود مصفوفة من العناصر من نوع `T` ولا يعيد أي قيمة.

    2. تم إنشاء كائن من الفئة `Random` لتوليد أرقام عشوائية.

    3. يتم تنفيذ خوارزمية الاختلاط (Shuffle) على المصفوفة
    المعطاة. تبدأ العملية من العنصر الأخير في المصفوفة وتنتهي عند العنصر الأول.

    4. في كل تكرار من الحلقة، يتم توليد رقم عشوائي `j` بين 0
     و `i` (حيث `i` هو الفهرس الحالي في الحلقة) باستخدام `random.nextInt(i + 1)`.

    5. يتم تبديل العنصر الموجود في الفهرس `i` مع العنصر
    الموجود في الفهرس `j`. يتم استخدام متغير مؤقت `temp` لتبديل القيم بين العناصر.

    6. بعد الانتهاء من الحلقة، ستكون المصفوفة قد تم اختلاط عناصرها بشكل عشوائي.

    7. تنتهي الكود دون إزالة عنصر. إذا كنت ترغب في إزالة
     عنصر واحد من المصفوفة بعد الاختلاط، يمكنك إضافة سطر إضافي لحذف العنصر. على سبيل المثال،
    `array[array.length - 1] = null;` يمكن أن يستخدم لإزالة العنصر الأخير من المصفوفة.
     */
    public static <T> void shuffleAndRemove(T[] array) {
        Random random = new Random();

        // Shuffle the array
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Remove entries one by one
        while (array.length > 0) {
            int randomIndex = random.nextInt(array.length);
            T removedEntry = array[randomIndex];
            System.out.println("Removed: " + removedEntry);

            // Shift the remaining entries to fill the gap
            for (int i = randomIndex; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Reduce the array size by 1
            array = java.util.Arrays.copyOf(array, array.length - 1);
        }
    }
}
