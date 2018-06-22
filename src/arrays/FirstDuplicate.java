/*
    cheborca @2018
 */
package arrays;

/*
    An array with numbers, find and return the first duplicate number. If the
    array has 2 or more duplicates elements, show the the number with a smaller 
    index. If there are no such duplicate elements, return -1.
 */
public class FirstDuplicate {

    int firstDuplicate(int[] a) {
        if (a.length <= 1) {
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            int pos = Math.abs(a[i]) - 1;
            if (a[pos] < 0) {
                return pos + 1;
            } else {
                a[pos] = -a[pos];
            }
        }
        return -1;
    }
}
