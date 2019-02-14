package algorithms;

import java.util.LinkedList;

class AdjacencyList {


        LinkedList<Integer> adjlist[];
        int noOfVertices;

        AdjacencyList(int no) {
           this.noOfVertices = no;
           adjlist = new LinkedList[no];
           for (int i=0; i<no;i++){
               adjlist[i] = new LinkedList<>();
           }
        }

        void addEdge(int src, int dest) {
            adjlist[src].addFirst(dest);
            adjlist[dest].addFirst(src);
        }

        void printGraph() {
            for (int i=0; i<noOfVertices;i++){
                System.out.print("head "+i);
               adjlist[i].forEach((temp) ->{
                   System.out.print("->"+temp);

               });
                System.out.println();
            }
        }
    }
    