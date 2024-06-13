package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public class Node {

        public String data;
        Node next;

        Node(String data){
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
    //Para criar uma lista, deve-se informar um valor inicial para ela não iniciar vazia.
    public LinkedList(String data){
        Node firstNode = new Node(data);
        this.head = firstNode;
        this.tail = firstNode;
        this.size = 1;
    }

    public String getHead(){
        return this.head.data;
    }

    public String getTail(){
        return this.tail.data;
    }

    public int getSize(){
        return this.size;
    }

    public Node get(int index){
        if (this.size == 0) return null;
        if (index < 0 || index > this.size) return null;
        Node leitor = this.head;
        for (int i = 0; i < index; i++) {
            leitor = leitor.next;
        }
        return leitor;
    }

    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void print(){
        Node leitor = this.head;
        System.out.println("##################################");
        while(leitor != null){
            System.out.println(leitor.data);
            leitor = leitor.next;
        }
        System.out.println("##################################");
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(this.size == 0){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
        this.size++;
    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if (this.size == 0){
            this.head = newNode;
            this.tail = newNode;
        } else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
    }
    
    public boolean insert(int index, String data){
        if(index <0 || index > this.size) return false;
        if(index == 0){
            this.prepend(data);
            return true;
        }
        if (index == this.size){
            this.append(data);
            return true;
        }
        Node newNode = new Node(data);
        Node anterior = this.get(index-1);
        newNode.next = anterior.next;
        anterior.next = newNode;
        return true;

    }

    public Node removeLast(){
        if (this.size == 0) return null;
        Node pre = this.head;
        Node temp = null;

        while (pre.next != this.tail){
            pre = pre.next;
        }

        temp = tail;
        this.tail = pre;
        this.tail.next = null;
        this.size--;

        if(this.size == 0){
            this.tail = null;
            this.head = null;
        }

        return temp;
    }

    public Node removeFirst(){
        if (this.size == 0) return null;
        Node temp = this.head;
        this.head = temp.next;
        temp.next = null;
        this.size--;
        if(this.size == 0){
            this.head = null;
            this.tail = null;
        }

        return temp;
    }

    public Node delete(int index){
        if (index < 0 || index > this.size) return null;
        if (index == 0) return this.removeFirst();
        if (index == this.size) return this.removeLast();

        Node temp = this.get(index);
        Node anterior = this.get(index-1);
        if (temp!= null){
            anterior.next = temp.next;
            temp.next = null;
            this.size--;
            return temp;
        }
        return null;
    }
}
