package designpattern.abstractfactorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/30 23:37
 */
public class Red implements Color{
    @Override
    public void getColor() {
        System.out.println("我是红色");
    }
}
