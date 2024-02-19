public class DLinkedList {
    public Node head;
    public Node tail;
    public String name;

    public DLinkedList(String name){
        this.name = name;
        this.head = null;
        this.tail = null;
    }

    public void append(int n){
        Node newNode = new Node(n);

        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
        }

        this.tail = newNode;
    }

    public void prepend(int n){
        Node newNode = new Node(n);

        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void deleteLast(){
        if(this.head == null){
            System.out.println(this.name + " is empty");
        }else if(head.next == null){
            head = null;
            tail = null;
            System.out.println("The last element is deleted." + this.name + " is now MT");
        }else{
            Node last = tail.prev;
            tail.prev = null;
            last.next = null;
            this.tail = last;
        }
    }

    public void deleteFirst(){

        if(this.head == null){
            System.out.println("Nothing to delete");
            return;
        }else if(this.head.next == null){
            head = null;
            tail = null;
            System.out.println(this.name + " is now M T ");
        }else{ // head.next != null && head != null
            Node folllow = head;
            head = head.next;
            head.prev = null;
            folllow.next = null;
            folllow = null;
        }
    }

    @Override
    public String toString(){
        if(head == null){
            return("the D-Linked List " + this.name + " is M T ");
        }

        StringBuilder sList = new StringBuilder();
        for(Node f = head; f != null; f = f.next){
            sList.append(f.nodeNum + "\n");
        }
        return sList.toString();
    }
}
