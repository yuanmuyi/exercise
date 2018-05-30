package designpattern.factorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 9:17
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我会画圆");
    }
}
