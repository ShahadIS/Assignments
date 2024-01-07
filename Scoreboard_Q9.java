
    /*
    Give Java code for performing add(e) and remove(i) methods for the Scoreboard class,
    as in Code Fragments 3.3 and 3.4, except this time, don’t maintain the game entries in order.
    Assume that we still need to keep n entries stored in indices 0 to n−1. You should be able to implement
    the methods without using any loops, so that the number of steps they perform does not depend on n.
دون استخدام أي حلقات ، بحيث لا يعتمد عدد الخطوات التي يقومون بها على n.
*/
    /*

في طريقة add(e) المعدلة، نتحقق أولاً مما إذا كان هناك مساحة متاحة في مصفوفة board. إذا كان هناك، فإننا نضيف إدخال اللعبة الجديدة e في المؤشر التالي المتاح ونزيد قيمة numEntries. إذا لم يكن هناك مساحة متاحة، فإننا نجد مؤشر أدنى درجة باستخدام طريقة findLowestScoreIndex()، وإذا كانت درجة إدخال اللعبة الجديدة e أعلى من أدنى درجة، فإننا نستبدل الإدخال في مؤشر أدنى الدرجة بالإدخال الجديد.

في طريقة remove(i) المعدلة، نقوم بإزالة إدخال اللعبة مباشرةً في المؤشر i بواسطة استبداله بإدخال اللعبة في المؤشر الأخير (numEntries - 1). ثم نقوم بتعيين الفهرس الأخير إلى null وننقص قيمة numEntries.

تُستخدم طريقة findLowestScoreIndex() للعثور على المؤشر لإدخال اللعبة ذي أدنى درجة. تقوم الطريقة بالتكرار عبر إدخالات اللعبة الموجودة وتتتبع المؤشر ذي الدرجة الأدنى.

بتنفيذ الطرق بهذه الطريقة، نتجنب استخدام أي حلقات تعتمد على عدد الإدخالات n، مما يضمن أن عدد الخطوات المنفذة لا يعتمد على n.
     */
   /* public class Scoreboard_Q9 {
        private int numEntries = 0; // number of actual entries
        private GameEntry[] board; // array of game entries (names & scores)

        public Scoreboard_Q9(int capacity) {
            board = new GameEntry[capacity];
        }

        public void add(GameEntry e) {
            if (numEntries < board.length) {
                board[numEntries] = e;
                numEntries++;
            } else {
                int lowestScoreIndex = findLowestScoreIndex();
                if (e.getScore() > board[lowestScoreIndex].getScore()) {
                    board[lowestScoreIndex] = e;
                }
            }
        }

        public GameEntry remove(int i) throws IndexOutOfBoundsException {
            if (i < 0 || i >= numEntries) {
                throw new IndexOutOfBoundsException("Invalid index: " + i);
            }

            GameEntry removedEntry = board[i];
            board[i] = board[numEntries - 1];
            board[numEntries - 1] = null;
            numEntries--;

            return removedEntry;
        }

        private int findLowestScoreIndex() {
            int lowestScoreIndex = 0;
            for (int i = 1; i < numEntries; i++) {
                if (board[i].getScore() < board[lowestScoreIndex].getScore()) {
                    lowestScoreIndex = i;
                }
            }
            return lowestScoreIndex;
        }
    }

*/
