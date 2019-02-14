package algorithms;

import java.util.Stack;

public class Queue {

    Stack<Character> s1,s2;
   Queue() {
       s1 = new Stack<> ();
       s2 = new Stack<> ();
   }
    char dequeue() {
       if(!s2.isEmpty()){
          return s2.pop();
       }
      while(!s1.isEmpty()){
          s2.push(s1.pop());
      }
       if(!s2.isEmpty()) {
          return s2.pop();
       }
       else return '7';
    }
    
    void enqueue(char a) {
        s1.push(a);
    }

}
