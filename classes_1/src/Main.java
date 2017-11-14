
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cat cat = new Cat();

        cat.setName("Kolbasa");
        cat.setAge(6);
        System.out.println(cat.toString());
        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.setAge(3);
        System.out.println();
    }
}