package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.ArrayList;

public class _14_맥스힙 {
    public static void main(String[] args) {
        System.out.println("맥스 힙에 원소 추가 test: ");
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(3);
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(9);
        System.out.print("[null, 9, 4, 2, 3] 가 출력되어야 합니다!-> ");
        System.out.println(maxHeap.items); 


        System.out.println();
        System.out.println("맥스 힙의 원소 제거 test: ");
        MaxHeap maxHeap2 = new MaxHeap();
        maxHeap2.insert(8);
        maxHeap2.insert(6);
        maxHeap2.insert(7);
        maxHeap2.insert(2);
        maxHeap2.insert(5);
        maxHeap2.insert(4);

        System.out.print("[null, 8, 6, 7, 2, 5, 4] 가 출력되어야 합니다!-> ");
        System.out.println(maxHeap2.items);
       
        System.out.print("8 을 반환해야 합니다!->");
        System.out.println(maxHeap2.delete()); 
       
        System.out.print("[null, 7, 6, 4, 2, 5] 가 출력되어야 합니다!-> ");
        System.out.println(maxHeap2.items);
    }
}

class MaxHeap {
    ArrayList<Integer> items;

    public MaxHeap() {
        this.items = new ArrayList<>();
        this.items.add(null); // index 0 is not used
    }

    public void insert(int value) {
        // 1. 원소를 맨 끝에 추가합니다.
        this.items.add(value);
        int curIndex = this.items.size() - 1;

        while (curIndex != 1) {
            // 2. 부모 노드랑 비교해서 내가 더 크다면 위치를 바꾼다.
            int parentIndex = curIndex / 2;
            if (this.items.get(curIndex) > this.items.get(parentIndex)) {
                // Swap elements
                int temp = this.items.get(curIndex);
                this.items.set(curIndex, this.items.get(parentIndex));
                this.items.set(parentIndex, temp);
                curIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    public int delete() {
        // Swap root with last element
        int temp = this.items.get(1);
        this.items.set(1, this.items.get(this.items.size() - 1));
        this.items.set(this.items.size() - 1, temp);
        
        int prevMax = this.items.remove(this.items.size() - 1); // 8
        int curIndex = 1;

        while (curIndex <= this.items.size() - 1) {
            int leftChildIndex = curIndex * 2;
            int rightChildIndex = curIndex * 2 + 1;
            int maxIndex = curIndex;

            if (leftChildIndex <= this.items.size() - 1 && this.items.get(leftChildIndex) > this.items.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }

            if (rightChildIndex <= this.items.size() - 1 && this.items.get(rightChildIndex) > this.items.get(maxIndex)) {
                maxIndex = rightChildIndex;
            }

            if (maxIndex == curIndex) {
                break;
            }

            // Swap elements
            temp = this.items.get(curIndex);
            this.items.set(curIndex, this.items.get(maxIndex));
            this.items.set(maxIndex, temp);
            curIndex = maxIndex;
        }

        return prevMax; // 8
    }
}
