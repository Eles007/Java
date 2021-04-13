package Collection;

import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
	 
	 Route route = new Route(4);
	 
	 route.addEdge(0, 1);
	 route.addEdge(0, 3);
	 route.addEdge(1, 2);
	 route.addEdge(2, 3);
	 
	 System.out.println("Following is Depth First Traversal");
	 
	 route.DFS(0);
	 
	 
 }
}
