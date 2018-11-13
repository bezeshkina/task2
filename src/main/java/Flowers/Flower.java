package Flowers;

public abstract class Flower {
    private String name;
    private String color;
    private double price;

    protected Flower(String name, String color, double price){
        this.name = name;
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name of flower can't be empty");
        }
        this.color = color;
        if (color.isEmpty()){
            throw new IllegalArgumentException("Color of flower can't be empty");
        }
        this.price = price;
        if (price == 0){
            throw new NullPointerException("Price can't be null");
        }
        if (price < 0){
            throw new IllegalArgumentException("Price can't be less then zero");
        }
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }
}

