import java.util.*;

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
        printPhoneBook(phoneBook);
    }

    public static void addContact(HashMap<String, List<String>> phoneBook, String name, String phoneNumber) {
        if(phoneBook.containsKey(name)){
            List<String> numbers = phoneBook.get(name);
            numbers.add(phoneNumber);
        }else{
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(name, numbers);
        }
    }

    public static void printPhoneBook(HashMap<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> entry1, Map.Entry<String, List<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });

        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}