public class TestAnimal {
 public static void main(String[] args) {
    AnimalRegistry registry = new AnimalRegistry();

    Animal sheep1 = registry.createSheep("Dolly");
    Animal cow1 = registry.createCow();
    Animal horse1 = registry.createHorse("Brown");

    System.out.println(sheep1);
    sheep1.makeSound();

    System.out.println(cow1);
    cow1.makeSound();

    System.out.println(horse1);
    horse1.makeSound();
 }
}