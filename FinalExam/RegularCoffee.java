public class RegularCoffee extends Coffee implements Preparable{
    public double caffeineLevel;
    public boolean hasMilk;

    public RegularCoffee(String name, char sizeOption, double price) {
        super(name, sizeOption, price);
    }

    @Override
    public void displayIngredients() {
    }

    @Override
    public void displayDirection() {
    }

    public double getCaffeineLevel() {
        return caffeineLevel;
    }
    public void setCaffeineLevel(double caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }
    
}
