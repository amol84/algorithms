package algorithms;

public class LinkedList {

    public class Node {
        int value;
        Node next;


        Boolean hasNext() {
            return (this.next!=null);
        }

        Node(int value) {
            this.value = value;
        }
    }

    private int index = -1;


    private static int[] values;


    Node addNodes() {
        index++;
        if(index != values.length) {

            Node n = new Node(values[index]);

            n.next = addNodes();
            return n;
        }
        return null;
    }


    void printNodes(Node current) {
        if(current!=null){
            System.out.print(current.value + ",");
        }
        if(current.hasNext()) {
            printNodes(current.next);
        }
        System.out.println();
    }
    
    public Node reverseList(Node current, Node prevNode) {
        Node last = null;
            if(current!=null) {
            Node temp = current.next;
            current.next = prevNode;
            last = reverseList(temp, current);
        }
         else
            return prevNode;
        return last;
        }

}

