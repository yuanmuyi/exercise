package designpattern.factorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 9:18
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("我会画方");
    }
}
