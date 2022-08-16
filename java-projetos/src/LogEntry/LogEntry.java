package LogEntry;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogEntry {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private String name;
	private Date date;
	
	
	public LogEntry(String name, Date date) {
		this.name = name;
		this.date = date;
	}


	public String getName() {
		return name;
	}



	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		
		return "Usuario : " + name + ", Data de acesso: " + sdf.format(date);
	}
	

}
