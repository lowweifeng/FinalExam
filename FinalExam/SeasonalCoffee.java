public class SeasonalCoffee extends Coffee implements Preparable{
    public String season;

    public SeasonalCoffee(String name, char sizeOption, double price) {
        super(name, sizeOption, price);
    }

    @Override
    public void displayIngredients() {
    }

    @Override
    public void displayDirection() {
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }

}
