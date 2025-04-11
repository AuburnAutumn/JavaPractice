package javaPracticeTaskTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static List<Task> taskList = new ArrayList<>();
	//Lots of dealing with the scanner, best to get it all out of the way
	static Scanner scanner = new Scanner(System.in);
	static String answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayOptions();

	}
	
	public static void displayOptions() {
		System.out.println("Please select:\n1: Add task\n2: Update Task Status\n3: Delete task\n4: List all tasks\n5: List task status\n6: Search tasks\n7: Exit");
		answer = scanner.nextLine();
		
		switch (answer) {
			case "1":
				addTask();
				return;
			case "2": 
				updateTask();
				return;
			case "3":
				deleteTask();
				return;
			case "4":
				displayTasks();
				return;
			case "5": 
				listTaskStatus();
				return;
			case "6":
				searchTasks();
				return;
			case "7":
				System.exit(0);
			default:
				System.out.println("Please choose an option number");
				displayOptions();
				return;
		
		}
		
	}
	
	
	public static void addTask() {
		String taskName;
		String taskDescription;
		System.out.print("Enter task name: ");
		taskName = scanner.nextLine();
		if (taskName == "") {
			System.out.println("Title cannot be empty");
			displayOptions();
		} else {
		System.out.print("Enter task description:");
		taskDescription = scanner.nextLine();
		Task newTask = new Task(taskName, taskDescription);
		taskList.add(newTask);
		System.out.println("Created task "+ taskName);
		displayOptions();
		};

}
	
	public static void displayTasks() {
		int count = taskList.size()-1;
		if (taskList.isEmpty()) {
			System.out.println("No tasks to display");
		} else {
		while (count >= 0) {
			System.out.println(taskList.get(count).toString());
			count -= 1;
		};
		};
		displayOptions();
	}

	public static void updateTask() {
		int idNum;
		System.out.print("Please enter the id of the task to be updated: ");
		idNum = scanner.nextInt()-1;
		scanner.nextLine(); //Gotta eat that new line
		if (idNum < 0 || idNum >= taskList.size()) {
			System.out.println("This id does not exist");
		} else {
		System.out.println("Current status of task: " + taskList.get(idNum).getStatus());
		System.out.println("Please select a new status: \n1: To Do\n2: In Progress\n3: Done");
		answer = scanner.nextLine();
		switch (answer) {
			case "1":
				taskList.get(idNum).setStatus("To Do");
				break;
			case "2":
				taskList.get(idNum).setStatus("In Progress");
				break;
			case "3":
				taskList.get(idNum).setStatus("Done");
				break;
			default:
				System.out.println("Please select a valid option");
				updateTask();
				break;
		}
		};
		displayOptions();
	}

	public static void deleteTask() {
		int idNum;
		System.out.print("Please enter the id of the task to be deleted: ");
		idNum = scanner.nextInt()-1;//ID num -1 because IDs start at one but the indexes start at 0
		scanner.nextLine(); //Gotta eat that new line
		if (idNum < 0 || idNum >= taskList.size()) {
			System.out.println("This id does not exist");
		} else {
		taskList.remove(idNum); 
		};
		displayOptions();
		

	}

	public static void listTaskStatus(){
		if (taskList.isEmpty()) {
			System.out.println("No tasks to display");
		} else {
			int count = taskList.size()-1;
			while (count >= 0) {
				System.out.println("Task name: " + taskList.get(count).getTitle() + ", Task status: " + taskList.get(count).getStatus());
				count -= 1;
			};
		};
			displayOptions();
		}

	public static void searchTasks() {
		int idNum;
		System.out.print("Please enter the id of the task: ");
		idNum = scanner.nextInt()-1;
		scanner.nextLine(); //Gotta eat that new line
		if (idNum < 0 || idNum >= taskList.size()) {
			System.out.println("This id does not exist");
		} else {
		System.out.println("Task: " + taskList.get(idNum).toString());
		};
		displayOptions();

		
	}
}

