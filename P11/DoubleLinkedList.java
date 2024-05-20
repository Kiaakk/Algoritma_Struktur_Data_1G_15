package P11;

public class DoubleLinkedList {
    Node15 head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node15(null, item, null);
        } else {
            Node15 newNode = new Node15(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node15 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node15 newNode = new Node15(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            } 
            if (current.prev == null) {
                Node15 newNode = new Node15(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node15 newNode = new Node15(current.prev, item, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
