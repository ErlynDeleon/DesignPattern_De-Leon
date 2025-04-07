public class Horse implements Animal{
    public int legs;
    public String sound;
    public String food;
    public String color;

    public Horse() {
        this.food = "Hay";
        this.legs = 4;
        this.sound = "Neigh, Neigh";
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public Animal clone() {
        Horse clone = new Horse();
        clone.setColor(this.color);
        return clone;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String toString(){
        return "Horse color is " + color + ". It has " + legs + " legs, it make sound " + sound + ", and it eats " + food;
    }
}
