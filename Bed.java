public class Bed extends Item{
    private String brand , color,type,size;


    public Bed(String id,String brand,  int quantity, String color, String type, String size,double price) {
        super(id, price, quantity);
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Bed -> %s ,Brand= %s ,Color= %s , Size= %s ,Type= %s %n", super.toString(), brand ,color, size  , type );
    }
    
    
}
