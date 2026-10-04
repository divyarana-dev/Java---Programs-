class QueueUsingLinkedList {
    Node front, rear;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue:");
        queue.display();

        queue.dequeue();

        System.out.println("After dequeue:");
        queue.display();
    }
}
