public class runner {
    public static void main(String[] args) {
        tiger tigger = new tiger("Tigger");
        bear pooh = new bear("Pooh");
        unicorn rarity = new unicorn("Rarity");
        giraffe gemma = new giraffe("Gemma");
        bee stinger = new bee("Stinger");
        zookeeper zoebot = new zookeeper("Zoebot");
        animal[] animals = {gemma, tigger, rarity, stinger};
        zoebot.feedAnimals(animals , "pie");
    }
}
