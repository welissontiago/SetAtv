package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainVote {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votes = new HashMap<>();
		
		System.out.println("Enter file full path: ");
		String path = sc.next();
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(path));
			String line = bf.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(name)) {
					int totalValue = votes.get(name);
					votes.put(name, count + totalValue);
				} else {
					votes.put(name, count);
				}
			}
			
			line = bf.readLine();
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();

	}

}
