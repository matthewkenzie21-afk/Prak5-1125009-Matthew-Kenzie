package Util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int readInt() {
        return sc.nextInt();
    }

    public static double readDouble() {
        return sc.nextDouble();
    }

    public static String readLine() {
        return sc.nextLine();
    }
}