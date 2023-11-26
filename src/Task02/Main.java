package Task02;

import java.util.Arrays;

public class Main {

    static String[] bookList;

    public static void main(String[] args) {

        bookList = new String[]{"Great time", "Silver fog", "Super deal", "Great choice", "Bob and Mega", "Mathematics"};

        System.out.println("Non-sorted book list: ");

        int count = 0;
        for (String book : bookList) {
            count += 1;
            System.out.println(count + ") " + book);
        }

        Arrays.sort(bookList);

        System.out.println("\nSorted book list: ");

        count = 0;
        for (String book : bookList) {
            count += 1;
            System.out.println(count + ") " + book);
        }
    }
}

