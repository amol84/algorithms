package algorithms;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     runAdjacencyList();
     
	}

	private static void runAdjacencyList() {
        AdjacencyList graph = new AdjacencyList(6);
        graph.addEdge(0,3);
        graph.addEdge(0, 1);
        graph.addEdge(3,2);
        graph.addEdge(4,5);
        graph.printGraph();
		
	}

}
