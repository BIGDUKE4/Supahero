import java.util.ArrayList;

public class Database {

    //Array
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private int count = 0;

    public void addHeroes1(String superHeroName, String superPower, int creationYear, double height, boolean humanOrNot) {
        Superhero superhero = new Superhero(superHeroName, superPower, creationYear, height, humanOrNot);

    }

    public void addHeroes(Superhero hero){
        superheroes.add(hero);
    }
}

