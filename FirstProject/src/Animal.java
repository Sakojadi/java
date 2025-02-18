import tools.Tool;


public class Animal {
    String name;
    int age;

    public Animal(String n, int a){
        name = n;
        age = a;
    }

    public void makeSound(){
        System.out.println("Making sound");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String n, int a, String breed){
        super(n,a);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println("WOoooOOF WOOfffFf");
    }
}

class Cat extends Animal{
    boolean hasFur;

    public Cat(String n, int a, boolean hasFur){
        super(n,a);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
    public void makeSound(){
        System.out.println("MEOWW MEOWWWWW");
    }
    public void eat(){
        System.out.println("DRINKING, LICK LICK");
    }
}

class MainAnimal{
    public static void main(String[] args) {
        Cat egiptian = new Cat("eggy", 12, false);
        Dog ovcharka = new Dog("tolik", 10, "ovcharka");
        egiptian.makeSound();
        egiptian.eat();
        ovcharka.makeSound();
        ovcharka.eat();



        Tool t =  new Tool();
        t.y = 4;


    }
}
