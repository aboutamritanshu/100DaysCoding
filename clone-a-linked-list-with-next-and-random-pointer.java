class Clone 
{

    Node copyList(Node head) {
        if (head == null) return null;

        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        current = head;
        while (current != null) {
            if (current.arb != null) {
                current.next.arb = current.arb.next;
            }
            current = current.next.next;
        }

        Node newHead = head.next;
        current = head;
        Node newCurrent = newHead;
        while (current != null) {
            current.next = current.next.next;
            if (newCurrent.next != null) {
                newCurrent.next = newCurrent.next.next;
            }
            current = current.next;
            newCurrent = newCurrent.next;
        }

        return newHead;
    }
}
