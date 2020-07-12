package ru.geekbrains.java_3.lesson_6;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.out.println(Arrays.toString(method(new int[]{1, 2, 3, 4, 5, 6})));

    }

    static int[] method (int[] arr) {
        int a = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                a = i;
                break;
            }
        }
        logger.info("1 step");
        if (a < 0) {
            logger.error("RuntimeException");
            throw new RuntimeException();
        }
        int[] result = new int[arr.length - a -1];
        logger.info("2 step");
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i + a + 1];
        }
        logger.info("3 step");
        return result;
    }
}
