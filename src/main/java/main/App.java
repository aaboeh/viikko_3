package main;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Safe newSafe = new Safe("0000");

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon"); 
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");
            
            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna uusi PIN-koodi:");
                        String newPinCode = sc.nextLine();
                        newSafe.changePinCode(newPinCode);
                        break;
                    case 2:
                        System.out.println("Anna kansioon lisättävä tieto:");
                        String info = sc.nextLine();
                        newSafe.addToSafe(info);
                        break;
                    case 3:
                        System.out.println("Anna PIN-koodi:");
                        String pinCode = sc.nextLine();
                        ArrayList<String> safeContents = newSafe.getContentsFromSafe(pinCode);
                        if (safeContents != null) {
                            for (String content : safeContents) {
                                System.out.println(content);
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                }
            }                
        }
        sc.close();
    }
}
