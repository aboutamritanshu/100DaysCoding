class Solution
{
    Node delete(Node head, int k)
    {
        if (k == 1) {
            return null;
        }
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        Node current = head;
        Node prev = null;
        int count = 0;
        while (current != null) {
            count++;
            if (count % k == 0) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
