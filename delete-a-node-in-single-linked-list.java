class GfG
{
    Node deleteNode(Node head, int x)
    {
        if (head == null) {
            return null;
        }
        if (x == 1) {
            return head.next;
        }
        Node prev = null;
        Node current = head;
        int count = 1;
        while (current != null && count < x) {
            prev = current;
            current = current.next;
            count++;
        }
        if (current == null) {
            return head;
        }
        prev.next = current.next;
        return head;
    }
}
