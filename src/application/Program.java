package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Taxes.Pessoa;
import Taxes.PessoaFisica;
import Taxes.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of taz payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income:  ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();
				Pessoa pes = new PessoaFisica(name, anualIncome, healthExp);
				list.add(pes);
			}  else {
				System.out.print("Number of employees: ");
				int numberEmp = sc.nextInt();
				Pessoa pes = new PessoaJuridica(name, anualIncome, numberEmp);
				list.add(pes);
			}
		}
		
		double totalTaxes = 0.0;
		
		for(Pessoa pessoa : list) {
			totalTaxes = totalTaxes + pessoa.tax();
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pessoa p : list) {
			System.out.print(p.getName() + ": $ " + p.tax() + "\n");
		}
		System.out.print("TOTAL TAXES: $" + totalTaxes);
		
		sc.close();
	}

}
