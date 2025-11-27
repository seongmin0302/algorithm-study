package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

class LinkedList {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    
    public LinkedList(int value) {
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
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node getNode(int index) {
        Node cur = this.head;
        int curIndex = 0;
        
        while (curIndex != index) {
            cur = cur.next;
            curIndex += 1;
        }
        
        return cur;
    }

    public void addNode(int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = this.head;
            this.head = newNode;
            return;
        }
        
        Node prevNode = this.getNode(index - 1);
        Node nextNode = prevNode.next;
        prevNode.next = newNode;
        newNode.next = nextNode;
    }

    public void deleteNode(int index) {
        if (index == 0) {
            this.head = this.head.next;
            return;
        }
        Node prevNode = this.getNode(index - 1);
        Node indexNode = this.getNode(index);
        prevNode.next = indexNode.next;
    }
}

public class _01_링크드리스트_구현 {
    public static void main(String[] args) {

        LinkedList.Node node = new LinkedList.Node(5);
        System.out.println(node.data + " " + node.next);
        
        LinkedList.Node nextNode = new LinkedList.Node(3);
        node.next = nextNode;
        
        System.out.println("public void append(int value) test");
        LinkedList linkedList = new LinkedList(5);
        System.out.println(linkedList.head.data);
        linkedList.append(12);
        linkedList.append(8);
        linkedList.printAll();
        // [5] -> [12] -> [8]


        System.out.println("getNode(int index) test:");
        LinkedList linkedList2=new LinkedList(5);
        linkedList2.append(12);
        linkedList2.append(24);
        linkedList2.append(36);
        System.out.println(linkedList2.getNode(2).data);


        System.out.println("public void addNode(int index, int value) test:");
        LinkedList linkedList3=new LinkedList(5);
        linkedList3.append(10);
        linkedList3.append(20);
        linkedList3.append(30);
        linkedList3.printAll();

        linkedList3.addNode(1, 6);
        linkedList3.printAll();

        linkedList3.addNode(0, 7);
        linkedList3.printAll();


        System.out.println("public void deleteNode(int index)");
        LinkedList linkedList4 = new LinkedList(5);
        linkedList4.append(12);
        linkedList4.append(8);
        linkedList4.append(4);
        linkedList4.append(1);
        linkedList4.printAll();

        linkedList4.deleteNode(1);
        linkedList4.printAll();
        
        linkedList4.deleteNode(0);
        linkedList4.printAll();

        
    }
}
