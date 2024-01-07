public class Q4 {
    /*
    To modify the TicTacToe class to throw an IllegalStateException when a player tries to place a mark after the game has
     already been won, you can make the following changes to the putMark method:

    public void putMark(int i, int j) throws IllegalArgumentException, IllegalStateException {
    if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
        throw new IllegalArgumentException("Invalid board position");
    if (board[i][j] != EMPTY)
        throw new IllegalArgumentException("Board position occupied");
    if (isWin(X) || isWin(O))
        throw new IllegalStateException("Game already won");
    board[i][j] = player; // place the mark for the current player
    player = -player; // switch players (uses fact that O = -X)
}
*/
    /*

التحقق مما
إذا كانت موضع اللوحة صالحة وغير محتلة، قمنا بإضافة فحص إضافي لمعرفة ما إذا تم فوز أحد اللاعبين بالفعل في اللعبة.
 إذا كانت هذه الحالة صحيحة، فإننا نقوم برمي استثناء من نوع "IllegalStateException" مع رسالة "Game already won".

من خلال إضافة هذا الفحص، سيقوم طريقة "putMark" برمي استثناء إذا حاول أحد اللاعبين القيام بتحرك بعد
 أن تم فوز أحدهما بالفعل في اللعبة، مما يمنع الحركات غير الصالحة في مثل هذه الحالات.
     */
}
