package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entites.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Enter full file path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println("Enter salary ");
			Double salary = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
			emails.forEach(System.out::println);
			
			double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.println("of salary of people whose name starts with 'M': " + sum);
					
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
		sc.close();

	}

}
