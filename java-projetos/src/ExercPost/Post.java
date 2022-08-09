package ExercPost;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private int likes;
	private List<Comment> comment = new ArrayList<>();

	public Post(String title, String content, int likes) throws ParseException {	
		this.moment = new Date();
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		this.comment.add(comment);
	}

	public void showComment() {
		StringBuilder sb = new StringBuilder();
		for (Comment comment : comment) {
			System.out.println(sb.append(comment.getComentario()));
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments : " + "\n");
		comment.forEach(x -> sb.append(x.getComentario() + "\n"));
		
		return sb.toString();

	}

}
