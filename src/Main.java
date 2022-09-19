import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library sitaLibrary = new Library();

        while (true) {
            System.out.println("Vad vill du göra");
            System.out.println("1. Lägg till en bok i biblioteket");
            System.out.println("2. Söka efter en bok");
            System.out.println("3. Lista alla tillgängliga böcker");
            System.out.println("4. Återlämna en bok");
            System.out.println("5. Avsluta");

        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();

            if (val.equals("1")) {
                sitaLibrary.addBook();

            } else if (val.equals("2")) {

                sitaLibrary.searched();


            } else if (val.equals("3")) {

                sitaLibrary.allAvailableBooks();


            } else if (val.equals("4")) {
                sitaLibrary.returnABook();

            } else if (val.equals("5")) {
                System.out.println("Tack för besöket!!");
                System.out.println("Hoppas du är nöjd");
                break;

            } else {
                System.out.println("Inte ett giltigt alternativ");
            }

        }

    }
}