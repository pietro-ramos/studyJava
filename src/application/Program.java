package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;


public class Program {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner (System.in);
		 String name;
		 int age;
		 double height;
		 
		 System.out.println("Quantas pessoas serão digitadas? ");
		 int n = sc.nextInt();
		 sc.nextLine();
		 
		 Person pessoas[] = new Person[n];		 

		 for(int i = 0; i < n; i++)
		 {
			 System.out.println("Dados da " + (i+1) + "a pessoa: ");
			 System.out.println("Digite o nome: ");
			 name = sc.nextLine();
			 System.out.println("Digite a idade: ");
			 age = sc.nextInt();
			 sc.nextLine();
			 System.out.println("Digite a altura: ");
			 height = sc.nextDouble();
			 sc.nextLine();
			 pessoas[i] = new Person(name, age, height);
		 }
		 double media = Person.average(pessoas);
		 System.out.printf("Altura média: %.2f%n", media);
		 double percentage = Person.percentageMinor(pessoas);
		 System.out.printf("Pessoas com menos de 16 anos: %.2f", percentage);
		 System.out.print("%");
		 System.out.println();
		 
		 printMenores(pessoas);
		 
		 
		 sc.close();
	}

public static void printMenores(Person[] pessoas) {
    System.out.println("Nomes das pessoas com menos de 16 anos:");
    for (int i = 0; i < pessoas.length; i++) {
        Person pessoa = pessoas[i];
        if (pessoa.isMinor()) {
            System.out.println(pessoa.getName());
        }
    }
}
}