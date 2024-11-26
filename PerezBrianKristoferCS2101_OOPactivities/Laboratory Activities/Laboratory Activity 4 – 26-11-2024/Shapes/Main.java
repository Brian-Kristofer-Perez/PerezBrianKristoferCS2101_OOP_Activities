public class Main {
    public static void main(String[] args) {

       Square square = new Square(9);
       Rectangle rectangle = new Rectangle(9, 11);
       Triangle triangle = new Triangle(2, 3, 4);

       Shape[] shapes = {square, rectangle, triangle};
       ShapeCollection shapeCollection = new ShapeCollection(shapes);

       shapeCollection.getPropertyValues();
    }
}
