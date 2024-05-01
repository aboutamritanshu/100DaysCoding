class Solution {
    
    public Node arrangeCV(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        
        Node vowelHead = new Node('\0'); 
        Node consonantHead = new Node('\0'); 
        Node vowelTail = vowelHead;
        Node consonantTail = consonantHead;
        
        Node curr = head;
        while (curr != null) {
            if (isVowel(curr.data)) {
                vowelTail.next = curr;
                vowelTail = vowelTail.next;
            } else {
                consonantTail.next = curr;
                consonantTail = consonantTail.next;
            }
            curr = curr.next;
        }
        
        vowelTail.next = consonantHead.next; 
        consonantTail.next = null; 
        
        return vowelHead.next; 
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
