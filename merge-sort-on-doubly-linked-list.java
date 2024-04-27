class Solution {
    static Node merge(Node left, Node right, boolean increasing) {
        if (left == null) return right;
        if (right == null) return left;

        Node result = null;
        if ((left.data < right.data && increasing) || (left.data > right.data && !increasing)) {
            result = left;
            result.next = merge(left.next, right, increasing);
            if (result.next != null) {
                result.next.prev = result;
            }
        } else {
            result = right;
            result.next = merge(left, right.next, increasing);
            if (result.next != null) {
                result.next.prev = result;
            }
        }

        return result;
    }

    static Node split(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        if (temp != null) {
            temp.prev = null;
        }
        return temp;
    }

    static Node sort(Node head, boolean increasing) {
        if (head == null || head.next == null) return head;

        Node second = split(head);

        head = sort(head, increasing);
        second = sort(second, increasing);

        return merge(head, second, increasing);
    }

    static Node sortDoubly(Node head) {
        if (head == null || head.next == null) return head;

        boolean increasing = true;
        return sort(head, increasing);
    }

    static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(1);
        head.next.prev = head;
        head.next.next = new Node(5);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original List:");
        print(head);

        head = sortDoubly(head);

        System.out.println("Sorted List (Non-decreasing):");
        print(head);

        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        System.out.println("Sorted List (Non-increasing):");
        print(head);
    }
}


