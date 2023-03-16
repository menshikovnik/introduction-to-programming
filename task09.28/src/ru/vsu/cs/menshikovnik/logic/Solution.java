package ru.vsu.cs.menshikovnik.logic;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> arithmeticProgression(ArrayList<Integer> list) {
        ArrayList<Integer> copyList = new ArrayList<>(list);
        Collections.sort(copyList);
        int d = copyList.get(1) - copyList.get(0);
        for (int i = 0; i < copyList.size() - 1; i++) {
            if (copyList.get(i + 1) - copyList.get(i) != d) {
                return list;
            }
        }
        return copyList;
    }
}