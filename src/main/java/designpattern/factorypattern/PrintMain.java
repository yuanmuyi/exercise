package designpattern.factorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 9:24
 */
public class PrintMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getDraw("circle");
        shape.draw();
    }
}
