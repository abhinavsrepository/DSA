class Node {
    int data;
    Node next;
    Node prev;
    Node (int data){
        this.data = data;
    };
}

public class DoublyLinkeddList {
    Node head;
    public void insertEnd(int data){
        Node newNode = new Node(data);
        if (head==null){
            head= newNode;
            return;

        }
        Node temp = head;
        while(temp.next != null)
        temp= temp.next;
        temp.next= newNode;
        newNode.prev= temp;
    }
        public void delete(int key){
            

        }
    }
    
}
