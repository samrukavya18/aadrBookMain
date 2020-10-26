package book.src;

import java.util.Scanner;

public class addrBookMain {

	public static void main(String[] args) {
		
		BookManagerImp bm = new BookManagerImp();
		System.out.println("1. Create New Address Book");
		System.out.println("2. Open Address Book");
		System.out.println("3. Save Address Book");
		System.out.println("4. Save As Address Book");
		System.out.println("5. Close Address Book");
		System.out.println("6. Quit");
		
		int i=0;
		while(i==0)
		{
			Scanner wr = new Scanner(System.in);
			int choice = wr.nextInt();
			   switch (choice)
			   {
			   case 1:
				     break;
			   case 2:
		
		Scanner sc = new Scanner(System.in);

        boolean switcher = true;
        do {
        System.out.println("\n\tAddress Book Menu");
        System.out.println("\n\t\tEnter A to (A)dd Person ");
        System.out.println("\t\tEnter D to (D)elete Person");
        System.out.println("\t\tEnter E to (E)dit Person");
        System.out.println("\t\tEnter S to (S)earch Person ");
        System.out.println("\t\tEnter L to (L)ist ALL (sorted) ");
        System.out.println("\t\tEnter Q to Quit");
        System.out.print("\n\tPlease enter your choice: ");
        char choice = sc.nextLine().toUpperCase().charAt(0);


        while ((choice != 'A') && (choice != 'D') && (choice != 'E')  && (choice != 'S') && (choice != 'L')&& (choice != 'Q')) {
            System.out.println("Invalid choice!  Please select (A)dd, (D)elete, (E)dit, (S)earch, (L)ist or (Q)uit: ");
            choice = sc.nextLine().toUpperCase().charAt(0);
        }


        AddressBook newPerson = new AddressBook();
        ArrayList<AddressBook> person = new ArrayList<>(); 

        switch (choice) {
        case 'A' :      
        System.out.println("\nTo add a person, follow the prompts.");

        System.out.print("\nEnter Fullname: ");
        newPerson.setFullname(sc.nextLine());

        System.out.print("Enter Lastname: ");
        newPerson.setAddress(sc.nextLine());

        System.out.print("Enter City: ");
        newPerson.setCity(sc.nextLine());

        System.out.print("Enter State: ");
        newPerson.setState(sc.nextLine());

        System.out.print("Enter Zip: ");
        newPerson.setZip(sc.nextLine());

        System.out.print("Enter Phone Number: ");
        newPerson.setPhone(sc.nextLine());



        person.add(new AddressBook(newPerson.getFullname(), newPerson.getLastname(), newPerson.getCity(), newPerson.getState(), newPerson.getZip(), newPerson.getPhone()));
        System.out.println(person.get(0));


        System.out.println("\nYou have successfully added a new person!");

        break;

        case 'D' :



        break;
        case 'E' :



            break;
        case 'S' :




            break;
        case 'L' :








                                break;
        case 'Q' :
            switcher = false;
            System.exit(0);
            break;
        default:

        }

    }
        while (switcher != false);
        break;
    }
			   case 3:
				      break;
			   case 4 :
				      break;
			   case 5 :
				      break;
			   case 6 :
				      break;
	}

}
