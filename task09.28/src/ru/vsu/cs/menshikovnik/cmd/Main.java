package ru.vsu.cs.menshikovnik.cmd;

import ru.vsu.cs.menshikovnik.logic.*;
import ru.vsu.cs.menshikovnik.util.ArrayUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static InputArgs parseCmdArgs(String[] args) throws CmdParseArgsError {
        if (args.length != 2) {
            throw new CmdParseArgsError();
        }
        return new InputArgs(args[0], args[1]);
    }


    public static void main(String[] args) {

        InputArgs inputArgs = null;
        try {
            inputArgs = parseCmdArgs(args);
        } catch (CmdParseArgsError e) {
            System.err.println("Ошибка разбора аргументов командной строки");
            System.exit(1);
        }

        int[] sourceMatrix;
        sourceMatrix = ArrayUtils.readIntArrayFromFile(inputArgs.inputFile);

        Integer[] sourceMatrix1 = ArrayUtils.toObject(sourceMatrix);
        List<Integer> listArr = Arrays.asList(sourceMatrix1);
        ArrayList<Integer> listArr1 = new ArrayList<>(listArr);
        ArrayList<Integer> result = Solution.arithmeticProgression(listArr1);
        Integer[] arr2 = new Integer[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr2[i] = result.get(i);
        }
        int[] arr3 = ArrayUtils.toPrimitive(arr2);

        try {
            ArrayUtils.writeArrayToFile(inputArgs.outputFile, arr3);
        } catch (IOException e) {
            System.err.printf("Ошибка при записи массива в файл %s", e.toString());
            System.exit(3);
        }
    }
}