public class doublyLInkedListDLL {
    private Node head;
    private class Node{
        Node next;
        Node prev;
        int value;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }

    //Insert At First Position
    public void insertFirstDLL(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    //Displaying Doubly Linked List
    public void displayDLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;

        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        doublyLInkedListDLL dll=new doublyLInkedListDLL();
        dll.insertFirstDLL(12);
        dll.insertFirstDLL(6);
        dll.displayDLL();
    }
    
}
