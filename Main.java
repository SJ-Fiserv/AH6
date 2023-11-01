
public class Main {

	public static void main(String[] args) {
		Node<String> a = new Node<>("a");
	    Node<String> b = new Node<>("b");
	    Node<String> c = new Node<>("c");
	    Node<String> d = new Node<>("d");
	    a.next = b;
	    b.next = c;
	    c.next = d;											// a -> b -> c -> d
	    
	    
	    //Solution.linkedListValues(a);
	    for(String s : Solution.linkedListValues(a)) {
	    	System.out.print(s + " ");
	    }
	    // -> [ "a", "b", "c", "d" ]

	}

}
