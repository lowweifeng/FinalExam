abstract class Coffee{
    public String name;
    public char sizeOption;
    public double price;

    public Coffee(String name, char sizeOption, double price){
        this.name = name;
        this.sizeOption = sizeOption;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public char getSizeOption() {
        return sizeOption;
    }
    public void setSizeOption(char sizeOption) {
        this.sizeOption = sizeOption;
    }
}

