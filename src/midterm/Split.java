package midterm;

import java.util.ArrayList;

public class Split {

	public void run() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			array.add(i);
		}

		ArrayList<Integer> aa[] = split(array);
		System.out.println("first array");
		for (Integer i : aa[0]) {
			System.out.println(i);
		}

		System.out.println("second array");
		for (Integer i : aa[1]) {
			System.out.println(i);
		}
	}
	
	ArrayList<Integer>[] split(ArrayList<Integer> a) {
		return null;
	}
	
	public static void main(String[] args) {
		new Split().run();
	}
}
