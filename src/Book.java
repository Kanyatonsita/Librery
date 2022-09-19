public class Book {
    //Varje book har name, författare, år, upplaga och status.

    String name;
    String author;
    int year;
    int edition;
    boolean available;

    public Book(String name, String author, int year, int edition) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.available = true;
    }

    //metod loan  kollar om en bok gå att låna eller inte "tillgänglig eller inte" och göra följande:
    //Om boken är tillgänglig ska boken status ändras till otillgänglig och metoden ska retur true. Annars retur false.
    public boolean loan(Book b) {
        if (this.available) {
            available = false;
            return true;
        }
        return false;
    }
    public  String getName(){
        return name;
    }


    public String toString(){
       return "Title: " + name + " Author: "+ author + " From: "
               + year + " Edition: " + edition + " Available: " + available;
    }


}
