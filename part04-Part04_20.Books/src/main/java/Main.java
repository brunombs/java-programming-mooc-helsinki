import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String infos = scanner.nextLine();

        if (infos.equals("everything")){
            for (Book book : books){
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (infos.equals("name")){
            for (Book book : books){
                System.out.println(book.getTitle());
            }
        }
    }
}
