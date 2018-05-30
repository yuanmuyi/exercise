package designpattern.abstractfactorypattern;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/30 23:38
 */
public class Green implements Color {
    @Override
    public void getColor() {
        System.out.println("我是绿色");
    }
}
