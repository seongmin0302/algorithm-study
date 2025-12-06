package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

class LinkedListKthFromLast {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value=value;
            this.next=null;
        }
    }

    Node head;

    public LinkedListKthFromLast(int value) {
        this.head=new Node(value);
    }

    public void append(int value) {
        Node cur=this.head;
        while (cur.next!=null) {
            cur=cur.next;
        }
        cur.next=new Node(value);
    }

    public int getNode(int index) {
        int curIndex=0;
        Node cur=this.head;
        while(curIndex!=index) {
            cur=cur.next;
            curIndex++;
        }

        return cur.value;
    }

    public int size() {
        Node cur=head;
        int size=0;

        while (cur!=null) {
            cur=cur.next;
            size++;
        }

        return size;
    }

    public void printAll() {
        Node cur=this.head;

        while (cur!=null) {
            System.out.print(cur.value+"->");
            cur=cur.next;
        }
        System.out.println();
    }

    public int getKthFromLast(int kTh) {
        Node slowNode=this.head;
        Node fastNode=this.head;

        for(int i=1;i<kTh;i++) {
            fastNode=fastNode.next;
        }

        while(fastNode.next!=null) {
            slowNode=slowNode.next;
            fastNode=fastNode.next;
        }

        return slowNode.value;
    }
}

public class _07_링크드리스트_끝에서_K번째값_출력 {
    public static void main(String[] args) {
        LinkedListKthFromLast linkedList=new LinkedListKthFromLast(5);
        linkedList.append(10);
        linkedList.append(15);
        linkedList.append(20);
        linkedList.append(25);
        linkedList.append(30);
        linkedList.append(35);
        linkedList.printAll();
        System.out.println("size:"+linkedList.size());

        System.out.println("getNode test:");
        System.out.println(linkedList.getNode(0));
        System.out.println(linkedList.getNode(1));
        System.out.println(linkedList.getNode(2));
        System.out.println(linkedList.getNode(3));
        System.out.println(linkedList.getNode(4));
        System.out.println(linkedList.getNode(5));
        System.out.println(linkedList.getNode(6));

        System.out.println("getKthFromLast test:");
        System.out.println(linkedList.getKthFromLast(1));
        System.out.println(linkedList.getKthFromLast(2));
        System.out.println(linkedList.getKthFromLast(3));
        System.out.println(linkedList.getKthFromLast(4));
        System.out.println(linkedList.getKthFromLast(5));
        System.out.println(linkedList.getKthFromLast(6));
        System.out.println(linkedList.getKthFromLast(7));
    }
}


// package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

// class LinkedListKthFromLast {
//     static class Node {
//         int value;
//         Node next;

//         public Node(int value) {
//             this.value=value;
//             this.next=null;
//         }
//     }

//     Node head;

//     public LinkedListKthFromLast(int value) {
//         this.head=new Node(value);
//     }

//     public void append(int value) {
//         Node cur=this.head;
//         while (cur.next!=null) {
//             cur=cur.next;
//         }
//         cur.next=new Node(value);
//     }

//     public int getNode(int index) {
//         int curIndex=0;
//         Node cur=this.head;
//         while(curIndex!=index) {
//             cur=cur.next;
//             curIndex++;
//         }

//         return cur.value;
//     }

//     public int size() {
//         Node cur=head;
//         int size=0;

//         while (cur!=null) {
//             cur=cur.next;
//             size++;
//         }

//         return size;
//     }

//     public void printAll() {
//         Node cur=this.head;

//         while (cur!=null) {
//             System.out.print(cur.value+"->");
//             cur=cur.next;
//         }
//         System.out.println();
//     }

//     public int getKthFromLast(int kTh) {
//         int size=size();
//         return getNode(size-kTh);
//     }
// }

// public class _07_링크드리스트_끝에서_K번째값_출력 {
//     public static void main(String[] args) {
//         LinkedListKthFromLast linkedList=new LinkedListKthFromLast(5);
//         linkedList.append(10);
//         linkedList.append(15);
//         linkedList.append(20);
//         linkedList.append(25);
//         linkedList.append(30);
//         linkedList.append(35);
//         linkedList.printAll();
//         System.out.println("size:"+linkedList.size());

//         System.out.println("getNode test:");
//         System.out.println(linkedList.getNode(0));
//         System.out.println(linkedList.getNode(1));
//         System.out.println(linkedList.getNode(2));
//         System.out.println(linkedList.getNode(3));
//         System.out.println(linkedList.getNode(4));
//         System.out.println(linkedList.getNode(5));
//         System.out.println(linkedList.getNode(6));

//         System.out.println("getKthFromLast test:");
//         System.out.println(linkedList.getKthFromLast(1));
//         System.out.println(linkedList.getKthFromLast(2));
//         System.out.println(linkedList.getKthFromLast(3));
//         System.out.println(linkedList.getKthFromLast(4));
//         System.out.println(linkedList.getKthFromLast(5));
//         System.out.println(linkedList.getKthFromLast(6));
//         System.out.println(linkedList.getKthFromLast(7));
//     }
// }
