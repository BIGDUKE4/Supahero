public class Superhero {
    private String superHeroName;
    private String SuperPower;
    private int CreationYear;
    private double height;
    private boolean HumanOrNot;

    public Superhero (String Superheroname, String Superpower, int Creationyear, double height, boolean HumanOrNot){
        this.superHeroName = Superheroname;
        this.SuperPower = Superpower;
        this.CreationYear = Creationyear;
        this.height = height;
        this.HumanOrNot = HumanOrNot;
    }
//get
    public String getSuperheroname() {
        return superHeroName;
    }

    public String getSuperpower() {
        return SuperPower;
    }

    public int getCreationYear() {
        return CreationYear;
    }

    public boolean isHumanOrNot() {
        return HumanOrNot;
    }

    public double getHeight() {
        return height;
    }

    public void setSuperheroname(String superheroname) {
        superHeroName = superheroname;
    }

    public void setSuperpower(String superpower) {
        SuperPower = superpower;
    }

    public void setCreationYear(int creationYear) {
        CreationYear = creationYear;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHumanOrNot(boolean humanOrNot) {
        HumanOrNot = humanOrNot;
    }
    public String toString (){
        return "SuperheroName:" + " " + superHeroName + ", " + "Superpower:" + " "+ SuperPower + ", " + "CreationYear:" + " " + CreationYear
                + ", " + "Height:" + " " + height + ", " + "HumanOrNot:" + " " + HumanOrNot + ". ";
    }
}