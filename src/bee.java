public class bee extends animal {
    public bee(String name) {
        super(name, "pollen");
    }

    public void sleep(String name) {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep(name);
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
