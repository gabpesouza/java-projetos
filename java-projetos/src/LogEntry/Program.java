package LogEntry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<LogEntry> lista = new HashSet<>();
		File file = new File("C:\\entrada\\log.txt");
		int numeroUsuarios = 0;

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			String readLine = bf.readLine();
			while (readLine != null) {
				String[] split = readLine.split(" ");
				String name = split[0];
				Date date = Date.from(Instant.parse(split[1]));
				lista.add(new LogEntry(name, date));
				readLine = bf.readLine();

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (LogEntry usuario : lista) {
			numeroUsuarios++;
		}
		System.out.println("Numero de usuarios: " + numeroUsuarios);
		System.out.println("------------------");
		for (LogEntry usuario : lista) {
			System.out.println(usuario);

		}
	}

}
