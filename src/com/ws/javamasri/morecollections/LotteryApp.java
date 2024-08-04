package com.ws.javamasri.morecollections;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LotteryApp {

    private static final int NUMBERS = 6;
    private static final int MAX_NUMBERS = 40;
    private static final int PRIZE = 100;

    public static void main(String[] args) {
        Set<Integer> winningNumbers = createWinningNumbers();
        Set<Integer> tickets = getTickets();

        Set<Integer> matches = new TreeSet<>(tickets);

        // Using retainAll to remove non-common element
        matches.retainAll(winningNumbers);

        System.out.println("Your tickets was : " + tickets);
        System.out.println("Winning numbers  : " + winningNumbers);

        if (!matches.isEmpty()) {
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matched numbers : " + matches);
            System.out.printf("Your prize is $%.2f%n", prize);
        }
    }

    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winning = new TreeSet<>();
        Random random = new Random();

        while (winning.size() < NUMBERS) {
            int number = random.nextInt(MAX_NUMBERS) + 1;
            winning.add(number);
        }

        return winning;
    }

    public static Set<Integer> getTickets() {
        Set<Integer> tickets = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + NUMBERS + " lotto numbers: ");
        while (tickets.size() < NUMBERS) {
            int ticket = scanner.nextInt();
            tickets.add(ticket);
        }

        return tickets;
    }
}
