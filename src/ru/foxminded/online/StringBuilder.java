package ru.foxminded.online;

import ru.foxminded.online.inventory.Console;
import ru.foxminded.online.inventory.Reverse;

public class StringBuilder {
    public static void main(String[] args) {
//        new Reverse().test(new Console().inputStream());
        new Reverse().reverseStringByWords(new Console().inputStream());
    }
}
