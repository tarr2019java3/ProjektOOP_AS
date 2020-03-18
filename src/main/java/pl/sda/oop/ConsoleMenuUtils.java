package pl.sda.oop;

import java.util.Scanner;

public class ConsoleMenuUtils {
    Scanner scanner = new Scanner(System.in);
    public int getIntOptionFromKeyboard(){
        Integer option = scanner.nextInt();
        return option;
    }
}
