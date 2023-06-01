public class basicsLinkedList {
    private Node head;
    private Node tail;

    private int size;
    
    public basicsLinkedList(){
        this.size=0;

    }
    //Creating Class Node 
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
            this.next=null;

        }
    }

    //Inserting the Element at the Start of the Linked List
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        //If the Linked List is Empty, Tail==Head
        if(tail==null){
            tail=head;
        }

        size+=1;

    }

    //Inserting the Element at the End of the Linked List
    public void insertLast(int val){
         //If the Linked List is Empty,Call the Insert First Function
         if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

    }
    //Inserting at a particular index
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        //new node
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;

         temp.next=node;
         size++;

    }

    //delete firdt element
    public int  deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //Delete last element
    public int deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp= temp.next;
        }
        int value=temp.next.value;
        temp.next=null;
        tail=temp;
        size--;
        return value;
    }
    //Delete At a particular index
    public int deleteIndex(int index){
        Node temp=head;
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        int value=temp.next.value;
        temp.next=temp.next.next;
        size--;
        return value;
       


    }

    //Finding a node by it's value
    public Node findNode(int val){
        Node temp=head;
        while(temp.next!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
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

    //
    public static void main(String[] args) {
        basicsLinkedList bll= new basicsLinkedList();
        bll.insertFirst(6);
        bll.insertFirst(12);
        bll.insertFirst(18);
        bll.insertFirst(24);
        bll.insertFirst(30);
        bll.insertLast(0);
        bll.insert(100, 3);
        bll.insert(50, 7);
        bll.insert(20, 0);
        bll.insertLast(-18);
        bll.dislayLinkedList();
        //System.out.println("DELETE FIRST");
        // System.out.println(bll.deleteFirst());
        // bll.dislayLinkedList();
        // System.out.println("DELETE LAST");
        // System.out.println(bll.deleteLast());
        // bll.dislayLinkedList();
        // System.out.println("DELETE AT AN INDEX");
        // System.out.println(bll.deleteIndex(8));
        // bll.dislayLinkedList();
        System.out.println("FINDING A NODE BY IT'S VALUE");
        System.out.println(bll.findNode(100));
        bll.dislayLinkedList();
        
    }

    
}
