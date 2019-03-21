package ru.foxminded.online.inventory;

public class Reverse {

//    public void test(String source) {
//        for (String s : source.split(" ")) {
//            System.out.print(new StringBuilder(s).reverse().toString());
//            System.out.print(" ");
//        }
//    }

    private String reverseStringByCharacters(String characters) {
        char[] stringBuild = characters.toCharArray();
        int firstChar = 0;
        int lastChar = stringBuild.length - 1;
        while (firstChar < lastChar) {
            if(!Character.isAlphabetic(stringBuild[firstChar])) {
                firstChar++;
            } else if(!Character.isAlphabetic(stringBuild[lastChar])) {
                lastChar--;
            } else {
                char temp = stringBuild[firstChar];
                stringBuild[firstChar] = stringBuild[lastChar];
                stringBuild[lastChar] = temp;
                firstChar++;
                lastChar--;
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
