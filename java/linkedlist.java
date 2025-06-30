class Node {
    int data;
    Node next;
    Node prev;
    Node (int data){
        this.data= data;
    }
}
public class linkedlist {
    Node head;
    public void insertEnd(int data){
        Node newNode = new Node (data);
        if (head== null){
            head = newNode;
            return;

        }
        Node temp = head;
        while(temp.next!=null)
        temp=temp.next;

        temp.next = newNode;
        newNode.prev= temp;
    }
    public void delete(int key){
        Node temp = head;

        while(temp!= null && temp.data!=key)
        temp= temp.next;
        if(temp ==null)
        return;
        if(temp.prev!=null)
        temp.prev.next = temp.next;
        else
        head= temp.next;

        if(temp.next!=null)
        temp.next.prev = temp.prev;
        
    }
    
}
