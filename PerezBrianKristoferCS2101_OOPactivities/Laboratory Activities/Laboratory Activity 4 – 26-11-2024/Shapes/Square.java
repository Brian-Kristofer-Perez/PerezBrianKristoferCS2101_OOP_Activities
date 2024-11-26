public class Square implements Shape{

    private double side;

    public Square(double size){
        this.side = size;
    }

    @Override
    public double getArea(){
        return this.side * this.side;
    }

    @Override
    public double getPerimeter(){
        return this.side * 4;
    }

    @Override
    public void printShapeType(){
        System.out.println("Square");
    }
}
