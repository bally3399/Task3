import java.util.HashMap;
import java.util.Scanner;


public class PhoneBookApp {
    private final HashMap<String, String> contacts = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBookApp phonebook = new PhoneBookApp();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add Contact\n2. Search by Name\n3. Delete Contact\n4. Display Contacts\n5. Dial Contact\n6. Exit");
            System.out.print("Enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    phonebook.addContact();
                    break;
                case 2:
                    phonebook.searchByName();
                    break;
                case 3:
                    phonebook.deleteContact();
                    break;
                case 4:
                    phonebook.displayContacts();
                    break;
                case 5:
                    phonebook.dialContact();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    public void addContact() {
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        contacts.put(phoneNumber, name);

        System.out.println("Contact added successfully!\n");
    }

    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String searchName = scanner.nextLine();

        if (contacts.containsKey(searchName)) {
            System.out.println("Search Results:");
            System.out.println(contacts.get(searchName));
        } else {
            System.out.println("Contact not found!\n");
        }
    }

    public void deleteContact() {
        System.out.print("Enter Name to delete: ");
        String deleteName = scanner.nextLine();

        String removedContact = contacts.remove(deleteName);
        if (removedContact != null) {
            System.out.println("Contact deleted successfully!\n");
        } else {
            System.out.println("Contact not found!\n");
        }
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (HashMap.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();
    }
    public void dialContact() {
        System.out.print("Enter phoneNumber");
        String phoneNumber = scanner.nextLine();
        if (contacts.containsKey(phoneNumber)) {
            String contactName = contacts.get(phoneNumber);
            System.out.println("Dialing " + contactName + "\n"+ phoneNumber);
        } else {
            System.out.println("Contact not found! Unable to dial.");
        }
    }
}
