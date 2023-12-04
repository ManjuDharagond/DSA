public class LinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
//        Node currNode = head;
//        while (currNode.next!=null){
//            currNode = currNode.next;
//        }
//        currNode.next = newNode;
        tail.next = newNode;
        tail = newNode;
    }

    public boolean search(int data){
        Node currNode = head;
        while (currNode!=null){
            if(currNode.data == data){
                System.out.println(data);
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public void delete(int data){

        if(head.data == data ){
            if(head.next != null){
                head = head.next;
                return;
            }else {
                head = null;
            }
        }

        Node currNode = head;
        Node prev = currNode;
        while (currNode!=null){
            if(currNode.data == data){
                prev.next = currNode.next;
                return;
            }
            prev = currNode;
            currNode = currNode.next;
        }
    }


    public void printLL(Node head){
        Node currNode = head;
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.addHead(1);
        System.out.println();
       ll.add(2);
       ll.add(3);
       ll.add(4);
//       ll.delete(1);
//       ll.printLL(head);
//        System.out.println(ll.search(1));

    }
}
