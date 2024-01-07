import java.util.*;
public class Q6 {
    /*Give three different examples of a single Java statement that assigns variable, backup,
    to a new array with copies of all int entries of an existing array, original
نسخ حتياطية:
*/

   // int[] original={1,3,66,45};
//1. Using a for loop:
  // int[] backup = new int[original.length];
   //for (int i = 0; i < original.length; i++) {
     //   backup[i] = original[i];
//}
/*
2. Using the `System.arraycopy` method:

int[] backup = new int[original.length];
System.arraycopy(original, 0, backup, 0, original.length);
*/

//3. Using the `Arrays.copyOf` method:

  // int[] backup = Arrays.copyOf(original, original.length);

/*
In all three examples, a new array `backup` is created with the same length as the `original` array.
The values from the `original` array are then copied into the `backup` array using different
approaches. The resulting `backup` array will contain copies of all `int` entries from the `original` array.
     */
}
