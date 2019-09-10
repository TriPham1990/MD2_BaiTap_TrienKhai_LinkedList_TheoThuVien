public class MyLinkedList<E>{
    private class Node{
        private Node next;
        private Node previous;
        private E data;

        public Node(E data){
            this.data = data;
        }

        public E getData(){
            return this.data;
        }
    }

    private Node head;
    private Node tail;
    private int numNodes = 0;

    public MyLinkedList(){

    }

    public void add(int index, E e){
        Node temp = this.head;
        Node holder;
        for(int i = 1; i < index && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp;
        temp = new Node(e);
        temp.next = holder;
        temp.previous = holder.previous;
        holder.previous.next = temp;
        holder.previous = temp;
        this.numNodes++;
    }

    public void addFirt(E e){
        Node temp = this.head;
        if(this.head == null){
            this.head = new Node(e);
            this.tail = this.head;
            this.numNodes++;
        } else {
            this.head = new Node(e);
            this.head.next = temp;
            temp.previous = this.head;
            this.numNodes++;
        }
    }

    public void addLast(E e){
        if(tail == null){
            this.tail = new Node(e);
            this.head = this.tail;
            this.numNodes++;
        } else {
            Node temp = this.tail;
            this.tail = new Node(e);
            this.tail.previous = temp;
            temp.next = this.tail;
            this.numNodes++;
        }
    }

    public Node remove(int index){
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
        temp.next = null;
        temp.previous = null;
        this.numNodes--;
        return temp;
    }

    public boolean remove(E e){
        Node temp = this.head;
        for(int i = 1; i < this.numNodes; i++){
            if(e == temp.data){
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                temp.next = null;
                temp.previous = null;
                this.numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size(){
        return this.numNodes;
    }

    public MyLinkedList clone(){
        MyLinkedList<E> newList = new MyLinkedList<>();
        newList.head = this.head;
        newList.tail =this.tail;
        newList.numNodes = this.numNodes;
        return newList;
    }

    public boolean contains(E e){
        Node temp = this.head;
        for(int i = 1; i <= this.numNodes; i++){
            if(e == temp.data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e){
        Node temp = this.head;
        int check = -1;
        for (int i = 1; i <= numNodes; i++){
            if(e == temp.data){
                check = i;
                break;
            }
            temp = temp.next;
        }
        return check;
    }

    public boolean add(E e){
        if(head == null) {
            this.head = new Node(e);
            this.tail = this.head;
            this.numNodes++;
        }
        else {
            Node temp = this.head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(e);
            this.tail = temp.next;
            this.tail.previous = temp;
            this.numNodes++;
        }
        return true;
    }

    public E get(int index){
        Node temp = this.head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp.getData();
    }

    public E getFirt(){
        return this.head.getData();
    }

    public E getLast(){
        return this.tail.getData();
    }

    public void clear(){
        if(this.numNodes > 0){
            this.head = null;
            this.tail = null;
            this.numNodes = 0;
        }
    }
}