package designpattern.factorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 9:19
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("我会画三角");
    }
}
