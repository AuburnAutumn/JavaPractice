package hashMapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> petList = new HashMap<>();
		int quit = 0;
		
		petList.put("Gryphon", 8);
		petList.put("Swift", 13);
		petList.put("Soot", 6);
		
		Integer petsAge = petList.get("Gryphon");
		System.out.println("Gryphon's age is " + petsAge);
		petsAge = petList.get("Swift");
		System.out.println("Swift's age is " + petsAge);
		petsAge = petList.get("Soot");
		System.out.println("Soot's age is " + petsAge);
		
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		while (quit == 0) {
		System.out.println("Please input pet name");
		answer = scanner.nextLine();
		if (petList.containsKey(answer)) {
			petsAge = petList.get(answer);
			System.out.println(answer + " is " + petsAge + " years old");
		} else {
			System.out.println("Invalid name");
		};
		System.out.println("Quit? y/n");
		answer = scanner.nextLine();
		if (answer.equals("y")) {
			System.out.println("Thank you");
			quit = 1;
		} 
		}
	}

}
