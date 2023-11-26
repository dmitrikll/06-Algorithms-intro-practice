package Task03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] ticketList;
    static int ticketNumber;

    static public void main(String[] args) {

        ticketList = new int[]{1453, 4567, 3785, 9741, 5838, 7366};
        int winTicket = 9741;
        System.out.println("*List of tickets: " + Arrays.toString(ticketList));

        Scanner ticketScanner = new Scanner(System.in);
        System.out.print("\nPlease, enter ticket number: ");
        ticketNumber = ticketScanner.nextInt();

        int index = 0;
        for (int i = 0; i < ticketList.length; i += 1) {
            if (ticketNumber != winTicket) {
                index += 1;
            }
        }

        if (index > 0) {
            System.out.println("You lost - try again next time...");
        } else {
            System.out.println("You won - congratulations!");
        }
    }
}