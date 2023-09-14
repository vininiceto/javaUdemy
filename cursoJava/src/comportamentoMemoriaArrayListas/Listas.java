package comportamentoMemoriaArrayListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add(1, "Marco");
		list.add("Anderson");
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		System.out.println("---------------------------");
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
