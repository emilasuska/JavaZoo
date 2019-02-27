public class zookeeper {
    String name;

    public zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(animal[] animals, String food){

        for(int i = 0; i < animals.length; i++){
            animals[i].eat(food);
        }
        System.out.println(name + " is feeding " + food + " to " + animals.length + " of " + animal.population + " total number of animals.");
    }
}
