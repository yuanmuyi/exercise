package designpattern.abstractfactorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/30 23:52
 */
public class MainTest {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory abstractFactory = producer.getFactory("color");
        Color color = abstractFactory.getColor("red");
        color.getColor();
    }
}
