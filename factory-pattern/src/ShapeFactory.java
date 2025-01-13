public class ShapeFactory {
    
    Shape getShape(String shapeType) {
        if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
