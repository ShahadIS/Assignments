



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.util.Stack;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class TextEditor {
    static Stack<String> stack = new Stack<>();//static يعني أن المتغير stack هو متغير ثابت على مستوى الكلاس، مما يعني أنه يمكن الوصول إليه واستخدامه من أي مكان داخل الكلاس دون الحاجة إلى إنشاء كائن جديد من الكلاس.
    private Button undo;
    private TextArea textArea1;
    private Panel mainPanel;

    public static void main(String[] args) {
        Frame frame = new Frame("TextEditor");
        //في هذا السطر من الكود، يتم إنشاء كائن من الكلاس `TextEditor` ومن ثم يتم الوصول إلى متغير `mainPanel` الذي يحتوي على واجهة المستخدم الرئيسية للمحرر، ويتم إضافته إلى الـ `Frame` بتخطيط `BorderLayout` في وسط الإطار.
        frame.add(new TextEditor().mainPanel, BorderLayout.CENTER);
        //هذا الكود يعين ليسينر لحدث إغلاق النافذة (WindowEvent) على الـ Frame. عندما يتم إغلاق النافذة، سيتم تنفيذ الكود الموجود داخل الدالة windowClosing.
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        frame.pack();//دالة تضبط حجم الفريم ليكون مناسب لعرض كافة البيانات دون قصور
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLocation(500, 500);
    }

    public TextEditor() {
        //إنشاء الكائنات داخل الكونستركتور يُستخدم بشكل شائع لتهيئة الكائنات وإعدادها قبل استخدامها في البرنامج، بما في ذلك إنشاء وتهيئة المتغيرات وتهيئة المكونات المرئية وتعيين القيم الافتراضية وغيرها من العمليات اللازمة.
        textArea1 = new TextArea();
        undo = new Button("Undo");
        //بشكل عام، هذا الكود ينفذ عملية التراجع (Undo) عند النقر على زر التراجع. إذا كان هناك عناصر في stack، فإن العنصر الأخير يستخرج من الـ stack ويتم عرضه في textArea1 كنص.
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty())
                    textArea1.setText(stack.pop());
            }
        });
// إضافة نصوص المفاتيح المكتوبة في textArea1 إلى stack عندما يتم ضغط المفتاح. يتم ذلك عن طريق
// استخدام مستمع حدث ضغطة المفتاح ودالة keyTyped، حيث يتم استرداد النص الحالي من textArea1 باستخدام getText()
// وإضافته إلى stack باستخدام push()، مما يتيح إمكانية التراجع عن التغييرات المطبقة على textArea1.
        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                stack.push(textArea1.getText());
            }
        });

        mainPanel = new Panel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(textArea1, BorderLayout.CENTER);
        mainPanel.add(undo, BorderLayout.SOUTH);
        mainPanel.setPreferredSize(new Dimension(500, 500));
    }
}
