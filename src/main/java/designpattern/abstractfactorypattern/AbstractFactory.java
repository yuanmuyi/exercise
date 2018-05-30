package designpattern.abstractfactorypattern;

import designpattern.factorypattern.Shape;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/30 23:39
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getDraw(String shape);
}
