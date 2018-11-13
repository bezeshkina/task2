package Flowers;

public class Main {
    public static void main(String[] args) {
        Rose rose1 = new Rose("Rose", "white", 35.0);
        Rose rose2 = new Rose ("Rose", "red", 36.33);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose1).addFlower(rose2).addFlower(rose1);
        System.out.println(bouquet.getPrice());
    }

}
