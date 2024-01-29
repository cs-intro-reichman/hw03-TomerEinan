/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // # feedback: **Return Statement:**
 *      // - Ensure that the 'dup' variable is properly used in the logic, and if necessary, consider returning 'dup' to its initial state (false) on each iteration of the outer loop.
        boolean dup = false;
        string uniqe = "";
        for (int i = 0; i < s.length(); i++){
            for (int k = 0; k < uniqe.length; k++){
                if (s.charAt(i) == uniqe.charAt(k) && s.charAt(i) != 32){
                    dup = true;
                }
            }
            if (!dup){
                unique += s.charAt(i);
                dup = false;
            }
        }
        return uniqe;
    }
}
