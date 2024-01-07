public class Q3 {
    /*
    Explain the changes that would have to be made to the program of Code Fragment 3.8 so that it could perform the Caesar cipher for messages that are written
    in an alphabet-based language other than English, such as Greek, Russian, or Hebrew:

    قم بتحديد عدد الأحرف في الأبجدية للغة المحددة.1
قم بإنشاء مصفوفات encoder و decoder بحجم يتناسب مع عدد الأحرف في الأبجدية.2
protected char[] encoder = new char[حجم احرف اللغة];
protected char[] decoder = new char[حجم احرف اللغة];

قم بتعديل نطاق الأحرف في تهيئة مصفوفتي encoder و decoder في البناء (Constructor) بحيث يتطابق مع الأحرف في الأبجدية للغة المحددة.3
 public CaesarCipher(int rotation) {
    for (int k = 0; k < 28; k++) {
        encoder[k] = (char) ('ا' + (k + rotation) % 28); // تعديل الحروف الأولية والنطاق
        decoder[k] = (char) ('ا' + (k - rotation + 28) % 28); // تعديل الحروف الأولية والنطاق
    }
}

قم بتعديل عملية التحويل في الطريقة transform للتعامل مع الأحرف في اللغة المحددة.4
private String transform(String original, char[] code) {
    char[] msg = original.toCharArray();
    for (int k = 0; k < msg.length; k++) {
        if (Character.isLetter(msg[k])) { // نتحقق من الحروف فقط
            int j = msg[k] - 'ا'; // سيكون القيمة بين 0 و 27
            msg[k] = code[j]; // استبدال الحرف
        }
    }
    return new String(msg);
}

قم بتحديث طريقة main لاختبار البرنامج باستخدام رسائل مكتوبة باللغة المحددة5
public static void main(String[] args) {
    CaesarCipher cipher = new CaesarCipher(3);
    System.out.println("رمز التشفير = " + new String(cipher.encoder));
    System.out.println("رمز الفك = " + new String(cipher.decoder));
    String message = "مرحبا بكم"; // رسالة باللغة المطلوبة
    String coded = cipher.encrypt(message);
    System.out.println("الرمز السري: " + coded);
    String answer = cipher.decrypt(coded);
    System.out.println("الرسالة: " + answer); // يجب أن تكون الرسالة الأصلية
}

من خلال إجراء هذه التغييرات، يمكنك تكييف برنامج تشفير قيصر ليعمل مع رسائل مكتوبة بلغات أخرى غير الإنجليزية،
 مع الأخذ في الاعتبار مجموعة الأحرف المحددة والعمليات اللازمة من حيث اليونيكود للغة المحددة.



     */
}
