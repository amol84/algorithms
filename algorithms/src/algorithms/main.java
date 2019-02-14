package algorithms;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAdjacencyList();
		runLongestWord();
		runCanWatchMovie();
	}

	private static void runCanWatchMovie() {
        CanWatchMovie main = new CanWatchMovie();
        int[] movieLengths = {3,4,2,1,5};
   System.out.println(main.canWatchMovie(movieLengths,10));		
	}

	private static void runAdjacencyList() {
		AdjacencyList graph = new AdjacencyList(6);
		graph.addEdge(0, 3);
		graph.addEdge(0, 1);
		graph.addEdge(3, 2);
		graph.addEdge(4, 5);
		graph.printGraph();

	}

	public static void runLongestWord() {
		LongestWord lw = new LongestWord();
		Scanner s = new Scanner(System.in);
		System.out.print(LongestWord.LongestWord(s.nextLine()));
	}

}
