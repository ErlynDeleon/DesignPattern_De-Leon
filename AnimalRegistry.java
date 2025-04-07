public class AnimalRegistry {
    public Sheep sheepPrototype;
    public Cow cowPrototype;
    public Horse horsePrototype;

    public AnimalRegistry() {
        this.cowPrototype = new Cow();
        this.horsePrototype = new Horse();
        this.sheepPrototype = new Sheep();
    }

    public Animal createSheep(String name){
       Sheep sheep = (Sheep) sheepPrototype.clone();
       sheep.setName(name);
       return sheep;
    }

    public Animal createCow(){
        return cowPrototype.clone();
    }

    public Animal createHorse(String color){
        Horse horse = (Horse) horsePrototype.clone();
        horse.setColor(color);
        return horse;
    }
}
