public class Main {
    public static  void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setName("Rax");

        dog.eat() ;
        dog.sound();
        System.out.println(dog.getName() + " eats");

        Cat cat = new Cat();
        cat.setName("Stormy");

        cat.eat() ;
        cat.sound();
        System.out.println(cat.getName() + " eats");

        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        home.MakeAllSound();
        home.adoptPet(dog1);
        home.MakeAllSound();


        home.adoptPet(cat1);
        home.MakeAllSound();


        home.adoptPet(dog2);
        home.MakeAllSound();


    }
}
