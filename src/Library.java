import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> allBooks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Library() {
        booksList();

    }

    //skriv in några böker och adda de till library list.
    public void booksList() {
        Book b1 = new Book(" Monster", " Jane Stevenson",  2015, 3);
        Book b2 = new Book(" Pippi", " Astrid Lindgren",  1950, 2);
        Book b3 = new Book(" The autumn", " My Dawson",  2001, 2);
        Book b4 = new Book(" Tomatoe tomato", " Engela Americano",  1998, 2);
        Book b5 = new Book(" Gröna växeter", " Gröna Tanten",  2004, 8);
        Book b6 = new Book(" Bröderna Lejonhjärta", " Astrid Lindgren",  1973, 1);

        allBooks.add(b1);
        allBooks.add(b2);
        allBooks.add(b3);
        allBooks.add(b4);
        allBooks.add(b5);
        allBooks.add(b6);
    }

    //adda boken till library.
    public void addBook() {
        System.out.println("Vänligen lägg till titeln på din bok här");
        String name = sc.nextLine();
        System.out.println("Vänligen lägg till författere på din bok här");
        String author = sc.nextLine();
        System.out.println("Vänligen ange vilken år din bok skrevs här");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Vänligen lägg till din bokutgåva här");
        int edition = sc.nextInt();
        sc.nextLine();
        allBooks.add(new Book(name, author, year, edition));

    }

    public void searched() {
        System.out.println("Vad heter boken du letar efter");
        String searchName = sc.nextLine();
        for (Book b : allBooks) {
            if (b.getName().equals(searchName));
            System.out.println("Vi har detta mästerverk:");
            System.out.println("Vill du låna den? j/n");
            String yesLoan = sc.nextLine();

            if (yesLoan.equals("j")) {
                System.out.println("okej!");
                b.loan(b);
                System.out.println("Du har lånat en book.");
                break;
            }
        }
    }


    public void returnABook() {
         System.out.println("Vad heter boken du vill returnera?");
         String returnBook = sc.nextLine();
         for (Book book: allBooks){
             if (book.getName().equals(returnBook));
                 System.out.println("Vill du lämna tillbaka boken? j/n");
                 String yesLeave = sc.nextLine();

                 if(yesLeave.equals("j")){
                     System.out.println(" okej!");
                     book.loan(book);
                 }
                     System.out.println("Boken är returneras.");
                     System.out.println("Tack för att du lämna tillbaka boken!");
                 break;
                 }
             }



    public void allAvailableBooks() {
        for (Book b : allBooks) {
            if (b.available) {
                System.out.println(b);
            }
        }}
}
