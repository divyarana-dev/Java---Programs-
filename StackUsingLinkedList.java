class StackUsingLinkedList {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.display();

        stack.pop();

        System.out.println("After pop:");
        stack.display();
    }
}
