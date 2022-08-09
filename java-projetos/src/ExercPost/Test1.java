package ExercPost;

import java.text.ParseException;
import java.util.Scanner;



public class Test1 {
	
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o titulo do post: ");
		String titulo = scan.nextLine();
		System.out.println("Digite o conteudo do post: ");
		String conteudo = scan.nextLine();
		
		Post post = new Post(titulo,conteudo, 5);
		
		System.out.println("Quantos comentarios quer adicionar? ");
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o comentario: ");
			Comment comment = new Comment(scan.nextLine());

			post.addComment(comment);
		
		}
		
		System.out.println("--------------------------------");
		
		System.out.print(post);
	
		
		
		
		
		
	}

}
