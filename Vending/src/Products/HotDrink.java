package Products;

public class HotDrink extends Product {

    private double volume;
    private int temperature;

    public HotDrink(String name, double price, double volume, int temperature)
    {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
        
    }
    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int value){
        temperature = value;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(double value){
        volume = value;
    }

    //  переопределение вывода продукта
    @Override
    public String toString(){
        return "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        ", temperature=" + temperature + "}";
    }
}
