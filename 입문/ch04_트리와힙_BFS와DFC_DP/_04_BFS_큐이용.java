package 입문.ch04_트리와힙_BFS와DFC_DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _04_BFS_큐이용 {
    private static Map<Integer, List<Integer>> graph = new HashMap<>();

    static {
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(1, 5));
        graph.put(3, Arrays.asList(1, 6, 7));
        graph.put(4, Arrays.asList(1, 8));
        graph.put(5, Arrays.asList(2, 9));
        graph.put(6, Arrays.asList(3, 10));
        graph.put(7, Arrays.asList(3));
        graph.put(8, Arrays.asList(4));
        graph.put(9, Arrays.asList(5));
        graph.put(10, Arrays.asList(6));
    }

    public static List<Integer> bfsQueue(Map<Integer, List<Integer>> adjGraph, int startNode) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.offer(startNode);
        List<Integer> visited = new ArrayList<>();
        Set<Integer> queued = new HashSet<>(); // 큐에 추가된 노드를 추적
        queued.add(startNode);
        
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            visited.add(currentNode);
            System.out.println("currentNode:"+currentNode+", adjGraph.get(currentNode): "+adjGraph.get(currentNode));
            
            for (int adjacentNode : adjGraph.get(currentNode)) {
                if (!visited.contains(adjacentNode) && !queued.contains(adjacentNode)) {
                    queue.offer(adjacentNode);
                    queued.add(adjacentNode);
                }
            }
        }
        
        return visited;
    }

    public static void main(String[] args) {
        System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 이 출력되어야 합니다!");
        System.out.println(bfsQueue(graph, 1)); // 1 이 시작노드입니다!
    }
}
