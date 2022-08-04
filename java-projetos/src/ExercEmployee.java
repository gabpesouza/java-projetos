
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos funcionarios serao registrados? ");
		int n = scan.nextInt();

		List<Employee> funcionarios = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionario # " + i);
			System.out.println("Id: ");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.println("Nome :");
			String nome = scan.next();
			System.out.println("Salario: ");
			double salario = scan.nextDouble();

			funcionarios.add(new Employee(id, nome, salario));

		}

		for (Employee employee : funcionarios) {
			System.out.println("ID : " + employee.getId());
			System.out.println("Nome : " + employee.getNome());
			System.out.println("Salario : " + employee.getSalario());

		}

		System.out.println("Digite o id do funcionario que tera o salario aumentado: ");
		int id = scan.nextInt();
		Employee y = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (y != null) {
			System.out.println("Entre com a porcentagem: ");
			int porcentagem = scan.nextInt();
			y.aumento(porcentagem);

		} else {
			System.out.println("Funcionario nao existe");
		}
		System.out.println();

		for (Employee employee : funcionarios) {
			System.out.println("ID : " + employee.getId());
			System.out.println("Nome : " + employee.getNome());
			System.out.println("Salario : " + employee.getSalario());
		}
		scan.close();

	}

}
