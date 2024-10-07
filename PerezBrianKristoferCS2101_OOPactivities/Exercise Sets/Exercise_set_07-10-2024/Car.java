public class Car {

    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size){
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    // getters
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public char getSize(){
        return size;
    }

    // setters
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setSize(char size){
        this.size = size;
    }

    // to string
    @Override
    public String toString(){
        String formattedPrice = String.format("%.2f", price);
        String formattedSize;

        switch(size){
            case 'S':
                formattedSize = "small";
                break;
            case 'M':
                formattedSize = "medium";
                break;
            case 'L':
                formattedSize = "large";
                break;
            default:
                formattedSize = "unknown";
        }

        return String.format("Car (%s) - P%s - %s", color, formattedPrice, formattedSize);
    }

    public static void main(String args[]){


        Car car1 = new Car("Red", 100000, 's');
        Car car2 = new Car("Blue", 600000, 'l');
        Car car3 = new Car("Yellow", 150000, 'm');
        Car car4 = new Car("Green", 6000000, 'l');

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
