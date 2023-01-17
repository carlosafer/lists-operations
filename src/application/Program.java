package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Monitor");
		list.add("Keyboard");
		list.add("Mouse");
		list.add("Headphone");
		list.add("Camera");
		
		System.out.println(list.size());
		
		System.out.println("\n<<Computer peripherals>>");
		for (String y : list) {
			System.out.println(y);
		}
		
		/* Removing keyboard from the list */
		System.out.println("\n<<Computer peripherals>>");
		list.remove("Keyboard");
		for (String a : list) {
			System.out.println(a);
		}
		
		/* Removing the third element from the list */
		/* A Array list starts in 0 */
		System.out.println("\n<<Computer peripherals>>");
		list.remove(3);
		for (String x : list) {
			System.out.println(x);
		}
		
		/* Removing elements that begin with the letter M */ 
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("\n<<Computer peripherals>>");
		for (String x : list) {
			System.out.println(x);
		}
		
		/* Adding elements again */
		list.add("Monitor");
		list.add("Keyboard");
		list.add("Mouse");
		list.add("Camera");
		
		/* Filtering elements that begins with the letter C */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		
		System.out.println("\n<<Computer peripherals>>");
		for (String x : result) {
			System.out.println(x);
		}
		
		/* Filtering any element that begins with the letter Z */
		String name = list.stream().filter(x -> x.charAt(0) == 'Z').findAny().orElse(null);
		System.out.println("\n<<Computer peripherals>>");
		System.out.println(name);
	}
}
