public class leetcode_83 {
    private Node head;
    private class Node{
        Node next;
        int value;
      
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
          
        }

    }
    //Inserting the Element at the Start of the Linked List
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }

    public Node deleteDuplicates(Node temp) {
        if(temp==null){
            return temp;
        }
        Node head=temp;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
            }
            else{temp=temp.next;}

        }
        return head;
        
        
        
    }
    //Displaying the Linked List
    public void dislayLinkedList(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        leetcode_83 l83=new leetcode_83();
        l83.insertFirst(3);
        l83.insertFirst(3);
        l83.insertFirst(2);
        l83.insertFirst(1);
        l83.insertFirst(1);
        l83.dislayLinkedList();


        
    }
    
}
