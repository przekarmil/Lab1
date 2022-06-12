package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

//  Proszę usunąć modyfikator static z metody leftPad. Co się stanie? | Błąd
//  proszę przywrócić static i zamienić public na private – co się stanie? | Nic

public class Main {
    public static String leftPad(String aText, char aChar, int aWidth){
        String res = aText;
        for (int i = 0; i < aWidth-aText.length(); i++) {
            res = aChar + res;
        }
        char[] resArray = res.toCharArray();
        for (int i = 0; i < resArray.length; i++) {
            if(Character.isLowerCase(resArray[i])){
                resArray[i] = Character.toUpperCase(resArray[i]);
            }
        }

        return new String(resArray);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbe do konwersji: ");
        int liczba = scanner.nextInt();
        System.out.printf("DEC = %d\tBIN = %s\tHEX = %s\n",  liczba,
                leftPad(Integer.toBinaryString(liczba), '0', 8 ), leftPad(Integer.toHexString(liczba), '0', 8));
    }
}
