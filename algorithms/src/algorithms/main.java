package algorithms;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runAdjacencyList();
		runLongestWord();
		runCanWatchMovie();
		runReverseLinkedList();
		runQueueImplementation();
	}

	private static void runQueueImplementation() {
        Queue q= new Queue();
        q.enqueue('a');
        q.enqueue('b');
        System.out.println(q.dequeue());
        q.enqueue('c');
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
		


	private static void runReverseLinkedList() {
        Scanner s = new Scanner(System.in);
        int size = Integer.parseInt(s.nextLine());
        int[] values = new int[size];
        LinkedList ll = new LinkedList();

        for(int i=0; i<size; i++) {
            values[i] = Integer.parseInt(s.nextLine());
        }
        LinkedList.Node start = ll.addNodes();
        ll.printNodes(start);
        start = ll.reverseList(start, null);
        ll.printNodes(start);
		
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
