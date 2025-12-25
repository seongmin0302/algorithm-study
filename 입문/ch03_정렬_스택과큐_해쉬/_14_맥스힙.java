package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.ArrayList;

public class _14_맥스힙 {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(3);
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(9);
        System.out.print("[null, 9, 4, 2, 3] 가 출력되어야 합니다!-> ");
        System.out.println(maxHeap.items); 
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
}
