package main;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Animal newAnimal = null;
        System.out.println( "Anna eläintarhalle nimi:" );
        String zooName = sc.nextLine();
        Zoo newZoo = new Zoo(zooName);

        boolean exit = false;
        while(!exit) {
            System.out.println( "1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma" );
            
            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int age = Integer.parseInt(sc.nextLine());
                        newAnimal = new Animal(species, name, age);
                        newZoo.addAnimal(newAnimal);
                        break;
                    case 2:
                        System.out.println(zooName + " pitää sisällään seuraavat eläimet:");
                        newZoo.listAnimals();
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int rounds = Integer.parseInt(sc.nextLine());
                        newZoo.runAnimals(rounds);
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
