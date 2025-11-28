package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

class LinkedList {
    
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
        }
    }

    Node head;

    public LinkedList(int data) {
        this.head=new Node(data);
    }

    public void append(int data) {
        Node cur=this.head;
        while (cur.next!=null) {
            cur=cur.next;
        }
        cur.next=new Node(data);
    }

    public Node getNode(int index) {
        Node cur=this.head;
        int nowIndex=0;

        while(nowIndex!=index)
        {
            cur=cur.next;
            nowIndex++;
        }

        return cur;
    }

    public void printAll() {
        Node cur=this.head;
        while (cur!=null) {
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();
    }

    public int size() {
        Node cur=this.head;
        int size=0;

        while (cur!=null) {
            size++;
            cur=cur.next;
        }
        return size;
    }

}

public class _02_두_링크드리스트의합_계산 {

    // public static int getLinkedListSum(LinkedList linkedList1, LinkedList linkedList2)
    // {
    //     return makeNumber(linkedList1)+makeNumber(linkedList2);
    // }

    // public static int makeNumber(LinkedList linkedList)
    // {
    //     int size=linkedList.size();
    //     int number=0;
    //     for(int i=0;i<size;i++)
    //     {
    //         number+=Math.pow(10, size)*linkedList.getNode(i).data;
    //         size--;
    //     }

    //     return number;

    // }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(6);
        linkedList1.append(7);
        linkedList1.append(8);
        linkedList1.printAll();
        
        System.out.println(linkedList1.size());
        
        LinkedList linkedList2 = new LinkedList(3);
        linkedList2.append(5);
        linkedList2.append(4);
        linkedList2.printAll();

        // System.out.println(getLinkedListSum(linkedList1, linkedList2));
    }
    
}
