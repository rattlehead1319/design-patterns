
import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        Queue<Node> clonedQueue = new LinkedList<>();
        Node root = new Node(node.val);
        clonedQueue.add(root);

        Set<Integer> visited = new HashSet<>();
        visited.add(node.val);
        int nodes = 1;

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            List<Node> currNeighbors = curr.neighbors;

            Node clonedCurr = clonedQueue.poll();
            List<Node> clonedCurrNeighbors = new ArrayList<>();
            // System.out.println("clonedCurr: "  + clonedCurr.val);
            // if (clonedCurr.val == 4) {
            //     System.out.println("curr: "  + curr.val);
            // }

            for (Node neighbor: currNeighbors) {
                Node clonedNewNeighbor = new Node(neighbor.val);
                // if (clonedCurr.val == 4) {
                //     System.out.println("clonedNewNeighbor: "  + clonedNewNeighbor.val);
                // }
                clonedCurrNeighbors.add(clonedNewNeighbor);

                if (!visited.contains(neighbor.val)) {
                    visited.add(neighbor.val);
                    queue.add(neighbor);
                    clonedQueue.add(clonedNewNeighbor);
                    nodes++;
                }

                //if (clonedCurr.val == 4) {
                //System.out.println("clonedCurr.neighbors:" + clonedCurr.neighbors.size());
                //}
            }
            if (clonedCurrNeighbors.size() > 0) {
                clonedCurr.neighbors = clonedCurrNeighbors;
            }

            System.out.println("clonedCurr: "  + clonedCurr.val + " clonedCurr.neighbors:" + clonedCurr.neighbors.size());
        }

        boolean[] visitedArr = new boolean[nodes+1];
        dfs(node, visitedArr);
        System.out.println();
        System.out.println();
        Arrays.fill(visitedArr, false);
        dfs(root, visitedArr);
        // System.out.println("root: "  + root.val);
        // System.out.println("root.neighbors: "  +∂ root.neighbors);
        return root;
    }


    private void dfs(Node root, boolean[] visited) {
        visited[root.val] = true;

        if (root.val == 4) {
            System.out.println("root: " + root.val);
        }

        for (Node nhbr: root.neighbors) {
            System.out.println("root: " + root.val + " nhbr.val: " + nhbr.val);
            if (!visited[nhbr.val]) {
                dfs(nhbr, visited);
            }
        }
    }

    public static void main(String[] args) {
        CloneGraph cg = new CloneGraph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        List<Node> nbrs1 = new ArrayList<>();
        nbrs1.add(node2);
        nbrs1.add(node4);
        node1.neighbors = nbrs1;

        List<Node> nbrs2 = new ArrayList<>();
        nbrs2.add(node1);
        nbrs2.add(node3);
        node2.neighbors = nbrs2;

        List<Node> nbrs3 = new ArrayList<>();
        nbrs3.add(node2);
        nbrs3.add(node4);
        node3.neighbors = nbrs3;

        List<Node> nbrs4 = new ArrayList<>();
        nbrs4.add(node1);
        nbrs4.add(node3);
        node4.neighbors = nbrs4;

        Node resultNode = cg.cloneGraph(node1);
        //cg.dfs(resultNode);

    }
}
