import java.util.Scanner;

public class ContactList {

	public static void main(String [] args) {
		 String name, number;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Person 1");
	        System.out.print("Enter name:\n");
	        name = in.nextLine();
	        System.out.print("Enter phone number:\n");
	        number = in.nextLine();
	        System.out.println("You entered: " + name + ", " + number + "\n");
	        ContactNode node1 = new ContactNode(name, number);
	        System.out.println("Person 2");
	        System.out.print("Enter name:\n");
	        name = in.nextLine();
	        System.out.print("Enter phone number:\n");
	        number = in.nextLine();
	        System.out.println("You entered: " + name + ", " + number + "\n");
	        ContactNode node2 = new ContactNode(name, number);
	        System.out.println("Person 3");
	        System.out.print("Enter name:\n");
	        name = in.nextLine();
	        System.out.print("Enter phone number:\n");
	        number = in.nextLine();
	        System.out.println("You entered: " + name + ", " + number + "\n");
	        ContactNode node3 = new ContactNode(name, number);
	        node3.insertAfter(node2);   // insert node3 after node2
	        node2.insertAfter(node1);   // insert node2 after node1
	        ContactNode temp = node1;
		System.out.println("CONTACT LIST");
	        while (temp != null){
	            temp.printContactNode();
	            temp = temp.getNext();
			System.out.println();
	        }
	}
} 