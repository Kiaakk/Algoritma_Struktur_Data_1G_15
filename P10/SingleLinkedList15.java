package P10;

public class SingleLinkedList15 {
    Node15 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.print("Isi Linked List" + "\t\t");
            while(tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list Kosong");
        }
    }

    void addFirst(int input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node15 ndInput = new Node15(input, null);
        Node15 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if(index < 0 ) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0 ) {
            addFirst(input);
        } else {
            Node15 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            } 
            temp.next = new Node15(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
