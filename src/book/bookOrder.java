package book;

import java.util.Comparator;
import java.util.TreeSet;

public class bookOrder {
    static class Book {
        private String bookName;
        private int pageNumber;
        private String authorName;
        private int dateOfIssue;

        Book(String bookName, int pageNumber, String authorName, int dateOfIssue){
            this.bookName = bookName;
            this.pageNumber= pageNumber;
            this.authorName = authorName;
            this.dateOfIssue = dateOfIssue;
        }

        public String getBookName() {
            return bookName;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public String getAuthorName() {
            return authorName;
        }

        public int getDateOfIssue() {
            return dateOfIssue;
        }
    }

    public static void main(String[] args) {
        TreeSet<Book> alpha = new TreeSet<>(Comparator.comparing(Book::getBookName));
        TreeSet<Book> page = new TreeSet<>(Comparator.comparing(Book::getPageNumber));

        alpha.add(new Book("Suç ve Ceza",650,"Dostoyevski",2014));
        alpha.add(new Book("Sapiens",500,"Harari",2020));
        alpha.add(new Book("Kukla",350,"Ahmet Ümit",2015));
        alpha.add(new Book("Sultanın Casusları",435,"Emrah Safa Gürkan",2016));
        alpha.add(new Book("Dava",420,"Kafka",2014));

        System.out.println("-Alphabet Ordered for Book Names-");

        for (Book book : alpha) {
            System.out.println(book.getBookName()+ " -- "+book.getAuthorName()+" -- "+book.getPageNumber()+" -- "+book.getDateOfIssue());
        }
        System.out.println("#########");
        System.out.println("-Ordered for Book Page Numbers-");

        page.add(new Book("Suç ve Ceza",650,"Dostoyevski",2014));
        page.add(new Book("Sapiens",500,"Harari",2020));
        page.add(new Book("Kukla",350,"Ahmet Ümit",2015));
        page.add(new Book("Sultanın Casusları",435,"Emrah Safa Gürkan",2016));
        page.add(new Book("Dava",420,"Kafka",2014));

        for (Book book : page) {
            System.out.println(book.getBookName()+ " -- "+book.getAuthorName()+" -- "+book.getPageNumber()+" -- "+book.getDateOfIssue());
        }
    }
}
