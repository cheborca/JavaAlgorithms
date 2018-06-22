/*
    cheborca @2018
 */
package arrays;

/*
    Have a string, find and return the first non-repeat character.
    If there are no such a character, return '_'.
 */
public class FirstNotRepeatingCharacter {

    char firstNotRepeatingCharacter(String s) {
        int count[] = new int[25];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 50]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 50] == 1) {
                return s.charAt(i);
            }
        }
        return '_';
    }
}
