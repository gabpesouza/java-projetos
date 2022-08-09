package ExercWorker;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Digite o nome do departamento: ");
		String department = scan.next();
		
		System.out.println("Digite o nome do trabalhador: ");
		String name = scan.next();
		System.out.println("Digite o nivel do trabalhador: ");
		String nivel = scan.next();
		WorkerLevel wl = WorkerLevel.valueOf(nivel);
		System.out.println("Digite o salario do trabalhador: ");
		double salary = scan.nextDouble();
		
		Worker worker = new Worker(name, wl, salary, new Department(department));
		
		System.out.println("Quantos contratos o trabalhador tem? : ");
		int contratos = scan.nextInt();
		
		for(int i = 1; i <= contratos ; i++) {
			
			System.out.println("Digite os dados do "+ i + " contrato");
			System.out.println("Data DD/MM/YYYY: ");
			String data = scan.next();
			Date date = sdf.parse(data);
			System.out.println("Valor por hora: ");
			double value = scan.nextDouble();
			System.out.println("Duracao em horas: ");
			int duration = scan.nextInt();
			HourContract hc = new HourContract(date, value, duration);
			worker.addContract(hc);	
		}
		
			System.out.println("Digite o mes e o ano para calcular a renda (MM/yyyy): " );
			String monthAndYear = scan.next();
			String[] strings = monthAndYear.split("/");
			int month = Integer.parseInt(strings[0]);
			int year = Integer.parseInt(strings[1]);
			
			System.out.println("Nome : " + worker.getNome());
			System.out.println("Departamento: " + worker.getDepartment().getName());
			System.out.println("Renda para: " + monthAndYear + " : " + worker.income(year, month));
			
			
			scan.close();
		
		
	}

}
