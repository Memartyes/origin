package ru.foxminded.online.inventory;

public class Reverse {

    private String reverseStringByCharacters(String string) {
        char[] stringBuild = string.toCharArray();
        int firstIndex = 0;
        int lastIndex = stringBuild.length - 1;
        while (firstIndex < lastIndex) {
            if(!Character.isAlphabetic(stringBuild[firstIndex])) {
                firstIndex++;
            } else if(!Character.isAlphabetic(stringBuild[lastIndex])) {
                lastIndex--;
            } else {
                char temp = stringBuild[firstIndex];
                stringBuild[firstIndex] = stringBuild[lastIndex];
                stringBuild[lastIndex] = temp;
                firstIndex++;
                lastIndex--;
            }
        }
        return new String(stringBuild);
    }

    public void reverseStringByWords(String string) {
        for (String s : string.split(" ")) {
            System.out.print(reverseStringByCharacters(s));
            System.out.print(" ");
        }
    }
}
