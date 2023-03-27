public class Animal {
    
    public enum AnimalType {
        MAMMAL,
        BIRD,
        REPTILE,
        FISH,
        INSECT
    }
    
    private String name;
    private AnimalType type;
    private int age;
    
    public Animal(String name, AnimalType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    
    
}
