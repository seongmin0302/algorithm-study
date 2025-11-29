package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

class LinkedListSum {
    
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public LinkedListSum(int value) {
        this.head=new Node(value);
    }

    public void append(int value) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(value);
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

    public void printAll() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.println();
    }


    // 새롭게 정의
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

    public static int getLinkedListSum(LinkedListSum linkedList1, LinkedListSum linkedList2)
    {
        int sum1 = getSingleLinkedListSum(linkedList1);
        int sum2 = getSingleLinkedListSum(linkedList2);
        return sum1 + sum2;
    }

    public static int getSingleLinkedListSum(LinkedListSum linkedList)
    {
        int size=linkedList.size();
        int exponent=size; // 지수
        int singleLinkedListSum=0;

        for(int i=0;i<size;i++)
        {
            int data=linkedList.getNode(i).data; // 노드의 데이터
            double digits=Math.pow(10, exponent-1); // 자릿수
            singleLinkedListSum+=digits*data;

            exponent--;
        }

        return singleLinkedListSum;
    }

    public static void main(String[] args) {
        System.err.println("test1:");
        LinkedListSum linkedList1 = new LinkedListSum(6);
        linkedList1.append(7);
        linkedList1.append(8);
        linkedList1.printAll();
        
        LinkedListSum linkedList2 = new LinkedListSum(3);
        linkedList2.append(5);
        linkedList2.append(4);
        linkedList2.printAll();

        System.out.println(getLinkedListSum(linkedList1, linkedList2));

        System.err.println("test2:");
        LinkedListSum linkedList3 = new LinkedListSum(6);
        linkedList3.printAll();
        
        LinkedListSum linkedList4 = new LinkedListSum(3);
        linkedList4.printAll();

        System.out.println(getLinkedListSum(linkedList3, linkedList4));


        System.err.println("test3:");
        LinkedListSum linkedList5 = new LinkedListSum(5);
        linkedList5.append(0);
        linkedList5.append(0);
        linkedList5.append(3);
        linkedList5.printAll();
        
        LinkedListSum linkedList6 = new LinkedListSum(5);
        linkedList6.append(0);
        linkedList6.append(0);
        linkedList6.append(2);
        linkedList6.printAll();

        System.out.println(getLinkedListSum(linkedList5, linkedList6));
    }
    
}
