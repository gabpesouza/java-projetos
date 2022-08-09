

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String nome;
	private WorkerLevel level;
	private double baseSalary;
	private List<HourContract> contract = new ArrayList<>();
	private Department department;

	public Worker(String nome, WorkerLevel level, double baseSalary, Department department) {
		this.nome = nome;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public void addContract(HourContract contract) {
		this.contract.add(contract);

	}

	public void removeContract(HourContract contract) {
		this.contract.remove(contract);
	}

	public double income(int year, int month) {
		Calendar cal = Calendar.getInstance();
		double sum = this.baseSalary;
		
		
		for (HourContract c : contract) {
			cal.setTime(c.getDate());
			if(cal.get(Calendar.YEAR) == year && cal.get(Calendar.MONTH)+1 == month) {
				sum+= c.totalValue();
			}
		
			
		}
		return sum;
		
	}
	public Department getDepartment() {
		return department;
	}
	
	public String getNome() {
		return nome;
	}
}