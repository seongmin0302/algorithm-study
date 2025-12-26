package 입문.ch04_트리와힙_BFS와DFC_DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class _03_DFS_스택이용 {
    private static Map<Integer, List<Integer>> graph = new HashMap<>();

    static {
        graph.put(1, Arrays.asList(2, 5, 9));
        graph.put(2, Arrays.asList(1, 3));
        graph.put(3, Arrays.asList(2, 4));
        graph.put(4, Arrays.asList(3));
        graph.put(5, Arrays.asList(1, 6, 8));
        graph.put(6, Arrays.asList(5, 7));
        graph.put(7, Arrays.asList(6));
        graph.put(8, Arrays.asList(5));
        graph.put(9, Arrays.asList(1, 10));
        graph.put(10, Arrays.asList(9));
    }

    public static List<Integer> dfsStack(Map<Integer, List<Integer>> adjacentGraph, int startNode) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode); 
        List<Integer> visited = new ArrayList<>();
        
        while (!stack.isEmpty()) { // 스택이 비지 않을때까지 반복
            int currentNode = stack.pop();
            visited.add(currentNode);
            System.out.println("currentNode:"+currentNode+", adjacentGraph.get(currentNode): "+adjacentGraph.get(currentNode));
            
            for (int adjacentNode : adjacentGraph.get(currentNode)) {
                if (!visited.contains(adjacentNode)) {
                    stack.push(adjacentNode);
                }
            }
        }
        
        return visited;
    }

    public static void main(String[] args) {
        System.out.println("[1, 9, 10, 5, 8, 6, 7, 2, 3, 4] 이 출력되어야 합니다!");
        System.out.println(dfsStack(graph, 1)); // 1 이 시작노드입니다!
    }
}
