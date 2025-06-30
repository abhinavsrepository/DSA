package linkrdlist;



public class DoublyLinkedList {
    Node head;

    // Insert at end
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node by value
    public void delete(int key) {
        Node temp = head;

        // Traverse to find the node
        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp == null) return; // Not found

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next; // deleting head

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display backward
    public void displayBackward() {
        Node temp = head;
        if (temp == null) return;

        // go to tail
        while (temp.next != null)
            temp = temp.next;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
