public class unicorn extends animal {
    public unicorn(String name) {
        super(name, "marshmallows");
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps in a cloud");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        sleep(name);
    }
}
