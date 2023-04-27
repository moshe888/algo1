import java.util.*;

public class PrimAlgorithm {

    public static List<Edge> prim(Map<String, List<Edge>> graph, WeightFunction weightFunction) {


        return null;
    }
}

    // Example edge class
    class Edge {
        String node;
        int weight;

        Edge(String node, String neighbor, int weight) {
            this.node = neighbor;
            this.weight = weight;
        }

    }
        // Example weight function interface
        interface WeightFunction {
            int getWeight(String node1, String node2);
        }





