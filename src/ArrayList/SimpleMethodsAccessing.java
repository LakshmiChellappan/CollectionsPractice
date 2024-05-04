package ArrayList;

import java.util.ArrayList;

public class SimpleMethodsAccessing {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Steve");
		names.add("Venba");
		names.add("Anbu");
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println(names.remove(0));
		System.out.println(names);
	}

}
