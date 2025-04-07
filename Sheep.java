public class Sheep implements Animal{
    public int legs;
    public String sound;
    public String food;
    public String name;

    public Sheep() {
        this.food = "Grass";
        this.legs = 4;
        this.sound = "Baaa, Baaa";
    }
    
    public void setName(String name){
        this.name = name;
    }
    @Override
    public Animal clone() {
        Sheep clone = new Sheep();
        clone.setName(this.name);
        return clone;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String toString(){
        return "Sheep name is " + name + ". It has " + legs + " legs, it make sound " + sound + ", and it eats " + food;
    }
}
