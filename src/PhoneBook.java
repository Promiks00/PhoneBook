import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        String name, phoneNumber;

        while(true){
            System.out.print("Введите имя контакта или 'exit' для завершения: ");
            name = scanner.nextLine();
            if(name.equals("exit")){
                break;
            }

            System.out.print("Введите телефонный номер: ");
            phoneNumber = scanner.nextLine();

            addContact(phoneBook, name, phoneNumber);
        }

        System.out.println("\nТелефонная книга");
        printPhoneBook();

        void addContact(HashMap<String, List<String>> phoneBook, String name, String phoneNumber){

        }

        void printPhoneBook(HashMap<String, List<String>> phoneBook){

        }
    }
}