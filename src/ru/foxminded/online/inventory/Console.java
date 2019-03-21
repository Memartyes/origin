package ru.foxminded.online.inventory;

import java.util.Scanner;

public class Console {
    public String inputStream() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
