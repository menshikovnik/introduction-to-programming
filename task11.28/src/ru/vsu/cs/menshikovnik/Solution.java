package ru.vsu.cs.menshikovnik;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String findElement(String text) {
        String[] str1 = text.split(" ");
        List<String> listResult = new ArrayList<>();
        for (String element : str1) {
            boolean check = false;
            char[] ch = element.toCharArray();
            for (char cyrillic : ch) {
                for (char latin : ch) {
                    if ((cyrillic >= 'А' && cyrillic <= 'Я') || (cyrillic >= 'а' && cyrillic <= 'я')) {
                        if ((latin >= 'A' && latin <= 'Z') || (latin >= 'a' && latin <= 'z')) {
                            String result = new String(ch);
                            listResult.add(result);
                            check = true;
                            break;
                        }
                    }
                }
                if (check) break;
            }
        }
        String delim = " ";
        return String.join(delim, listResult);
    }
}