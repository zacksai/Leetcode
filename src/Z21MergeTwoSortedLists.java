import com.sun.source.tree.BinaryTree;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Z21MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


            // Initialize first node and current node
            ListNode f = new ListNode(0);
            ListNode c = f;

            // Iterate till end of either list is reached
            while (list1 != null && list2 != null) {

                // Add lower of values to next and increment
                if (list1.val < list2.val) {
                    c.next = list1;
                    list1 = list1.next;
                } else {
                    c.next = list2;
                    list2 = list2.next;
                }

                // Increment
                c = c.next;
            }

            // Non-empty list can be handled with a single node
            if (list1 != null) c.next = list1;
            else if (list2 != null) c.next = list2;

            // Return the node after the first
            return f.next;
        }
    }

}
