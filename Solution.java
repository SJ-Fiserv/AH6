import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
	  
	Node<String> cur = head;
	List<String> listVal = new ArrayList<String>();
	
    while(cur != null) {
    	listVal.add(cur.val);
    	cur = cur.next;
    }
           
    return listVal;
  }
  
}