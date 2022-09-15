import java.util.Scanner;

public class Userinterface {
public void startProgram(){
    Scanner sc = new Scanner(System.in);


        int user;
        Database db = new Database();





        Database data = new Database(); //Objekt
        //BrugerInput
        do {
            System.out.println("""
                    Velkommen til SUPER HERO UNIVERSE.
                    1. Opret Superhelt
                    2. Tilgå Superhelt database
                    3. Søg efter Superhelte 
                    9. Afslut
                    """);

            user = sc.nextInt();
            if (user == 1) {
                System.out.println("Hvad hedder din superhelt?");
                String superHeroName = sc.next();
                System.out.println("Hvad er din superhelts superkræfter?");
                String Superpower = sc.next();
                System.out.println("Hvilket årstal blev din superhelt oprettet i?");
                int creationYear = sc.nextInt();
                System.out.println("Hvor høj er din superhelt?");
                double height = sc.nextDouble();
                System.out.println("Er din superhelt et menneske (Ja/Nej");
                String isHumanOrNotString = sc.next();
                boolean HumanOrNot = false;
                if (isHumanOrNotString.equalsIgnoreCase("Ja")) {
                    HumanOrNot = true;
                }

                //Kalder på metoden fra klassen "Database"
                data.addHeroes1(superHeroName, Superpower, creationYear, height, HumanOrNot);

            }else if (user == 2) {
                data.printData();
            }else if (user == 3) {
                System.out.println("søg");
                String hero = sc.next();
                Superhero herox = data.findSuperHero(hero);
                if(herox == null){
                    System.out.println("ingen superhelte fundet");
                }
                if (herox != null){
                    System.out.println(herox);
                }
            }
        } while (user != 9);
    }
}



