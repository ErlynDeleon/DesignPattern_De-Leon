public class Cow implements Animal{
    public int legs;
    public String sound;
    public String food;

    public Cow() {
        this.food = "Grass";
        this.legs = 4;
        this.sound = "Moo, Moo";
    }

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
        
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String toString(){
        return "Cow has " + legs + " legs. It make sound " + sound + " and it eats " + food;
    }
}
