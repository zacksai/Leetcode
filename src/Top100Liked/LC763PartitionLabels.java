package Top100Liked;

import java.util.ArrayList;
import java.util.List;

/**
 * ababcbacadefegdehijhklij
 * ab  c  ca
 */
public class LC763PartitionLabels {

    // Start at int i = position 0
    // Find the last occurrence of the letter at i and store that position as p
    // For every letter between i and p, find its last occurence
    // If the last occurrence is after p, update p to the new value
    // Store the difference between i and p in the list

    // Then, update i to the position after p and repeat until p = length-1
    // Return count

    public List<Integer> partitionLabels(String s) {

        // i for starting position, p for ending position
        int i = 0, p = 0;
        char currentChar = '@';
        List<Integer> r = new ArrayList<Integer>();

        for (int j = 0; j < s.length(); j++) {

            // Find the last occurrence of the letter at i and store that position as p

            // Initialize c to the value at i and p to its index
            currentChar = s.charAt(i);
            p = s.lastIndexOf(currentChar);


            for (int substringPosition = i + 1; substringPosition < p; substringPosition++) {

                // First, find the next unique character and load it into c
                if (s.charAt(substringPosition) == currentChar) continue;
                else currentChar = s.charAt(substringPosition);

                // Next, find the last index of this value. If it's > p, update p to it
                if (s.lastIndexOf(currentChar) > p) {
                    p = s.lastIndexOf(currentChar);
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
