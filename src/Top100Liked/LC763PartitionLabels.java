package Top100Liked;

import java.util.ArrayList;
import java.util.List;

/**
 * class to solve #763 Partition Labels:
 *
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 *
 * Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
 *
 * Return a list of integers representing the size of these parts.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 * Example 2:
 *
 * Input: s = "eccbbbbdec"
 * Output: [10]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 500
 * s consists of lowercase English letters.
 */
public class LC763PartitionLabels {

    // Start at int i = position 0
    // Find the last occurrence of the letter at i and store that position as p
    // For every letter between i and p, find its last occurrence
    // If the last occurrence is after p, update p to the new value
    // Store the difference between i and p in the list

    // Then, update i to the position after p and repeat until p = length-1
    // Return count

    /**
     * solution method
     * @param s string to partition
     * @return list of integer sizes of each partition
     */
    public List<Integer> partitionLabels(String s) {

        // i for starting position, p for ending position, c for current character, r for returnList
        int i = 0, p = 0;
        char c = '@';
        List<Integer> r = new ArrayList<Integer>();

        // Iterate through each substring
        for (int j = 0; j < s.length(); j++) {

            // Initialize c to the value at i and p to its index
            c = s.charAt(i);
            p = s.lastIndexOf(c);

            // Iterate through each unique value in the substring
            for (int k = i + 1; k < p; k++) {

                // First, find the next unique character and load it into c
                if (s.charAt(k) == c) continue;
                else c = s.charAt(k);

                // Next, find the last index of this value. If it's > p, update p to it
                if (s.lastIndexOf(c) > p) {
                    p = s.lastIndexOf(c);
                }
                // Repeat for each unique value in the substring
            }
            
            // Now, set the length of the first partition, update i, and repeat starting at the end of the substring
            r.add(Integer.valueOf(p-i+1));
            i = p+1;
            j = p;
        }

        // return the list
        return r;
    }
}
