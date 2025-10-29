interface Animal {
    void eat();
    void sleep();
    boolean isFull();
    void eatFood(String food, boolean isGood);
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public void eatFood(String food, boolean isGood) {

    }
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void sleep() {

    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public void eatFood(String food, boolean isGood) {

    }

    public void goOutside() {
        System.out.println("Dog is now outside");
    }
}

class Bird implements Animal {

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }

    @Override
    public void sleep() {

    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void eatFood(String food, boolean isGood) {
        // TODO: implement eatFood logic
    }

    public void fly() {
        System.out.println("Yay, I'm flying");
    }
}

public class Main {
    public static void feedAnimal(Animal animal) {
        System.out.println("Now feeding the animal");
        animal.eat();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.goOutside();


        System.out.println();
        Main.feedAnimal(dog);
        feedAnimal(cat);
        feedAnimal(new Bird());


        System.out.println(dog == new Dog());
    }
}