package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

class LinkedListAppend {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    
    public LinkedListAppend(int value) {
        this.head = new Node(value);
    }
    
    // LinkedList 의 가장 끝에 있는 노드에 새로운 노드를 연결해줘
    public void append(int value) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(value);
    }
    
    // linked_list 에서 저장한 head 를 따라가면서 현재 있는 노드들을 전부 출력해주는 함수.
    public void printAll() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}

public class _01_링크드리스트_구현1 {
    public static void main(String[] args) {
        LinkedListAppend.Node node = new LinkedListAppend.Node(5);
        System.out.println(node.data + " " + node.next);
        
        LinkedListAppend.Node nextNode = new LinkedListAppend.Node(3);
        node.next = nextNode;
        
        LinkedListAppend linkedList = new LinkedListAppend(5);
        
        System.out.println(linkedList.head.data);
        linkedList.append(12);
        
        // head
        // [5] -> [12]
        linkedList.append(8);
        linkedList.printAll();
        // [5] -> [12] -> [8]
    }
}
