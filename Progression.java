/** Generates a simple progression. By default: 0, 1, 2, ... */
         public class Progression {

         // instance variable
         protected long current;

             public Progression( ) { this(0); }

        public Progression(long start) { current = start; }

             public long nextValue( ) {
         long answer = current;
         advance( );
        return answer;
         }

             protected void advance( ) {
         current++;
         }

             public void printProgression(int n) {
         System.out.print(nextValue( )); // print first value without leading space
         for (int j=1; j < n; j++)
             System.out.print(" " + nextValue( )); // print leading space before others
         System.out.println( ); // end the line
         }
}
