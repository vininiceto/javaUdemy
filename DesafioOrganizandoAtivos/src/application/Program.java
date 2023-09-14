package application;

import java.util.*;

public class Program {
/*

		public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    String ativos[]= {""}; 

		    //Entrada dos tipos de ativos
		    System.out.println("Quantas letras que digitar:");
		    int quantidadeAtivos = scanner.nextInt();

		    // Entrada dos códigos dos ativos
		    for (int i = 0; i <= quantidadeAtivos; i++) {
		     
		    String codigoAtivo = scanner.nextLine();
		      codigoAtivo=ativos[i];
		      System.out.println("Letra:"); 
		    }
			int n = 4;

			Arrays.sort(ativos);
			// print output array
			System.out.println(
				"The names in alphabetical order are: ");
			for (int i = 0; i < n; i++) {
				System.out.println(ativos[i]);
			}

		    scanner.close();
	}
}

*/
	/*
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de palavras:\n");
		Integer n = sc.nextInt();
		System.out.print(n);
		String names[]= new String[n];
		for(int i=0;i<n;i++) {
			System.out.print("\nDigite a palavra:");
			System.out.print("\n"+i);
			names[i] = sc.next();
		}
		//String names[]= { "R", "A", "G", "R","L", "B"};
		Arrays.sort(names);
		System.out.println(			"Ordem alfabetica: ");
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
		sc.close();
	}
	*/
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    ArrayList < String > ativos = new ArrayList < > ();

	    //Entrada dos tipos de ativos
	    int quantidadeAtivos = scanner.nextInt();

	    // Entrada dos códigos dos ativos
	    for (int i = 0; i <= quantidadeAtivos; i++) {
	      String codigoAtivo = scanner.nextLine();
	      ativos.add(codigoAtivo);
	    }
	    Collections.sort(ativos);
	    for(int j = 0; j <= quantidadeAtivos; j++) {
	    System.out.println(ativos.get(j));
	    
	    }
	    scanner.close();
	  }
	}
