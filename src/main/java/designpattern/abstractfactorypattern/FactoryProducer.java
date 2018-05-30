package designpattern.abstractfactorypattern;

import designpattern.factorypattern.ShapeFactory;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/30 23:49
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String produceType){
        if ("shape".equals(produceType)){
            return new ShapeFactory();
        }
        if ("color".equals(produceType)){
            return new ColorFactory();
        }
        return null;
    }

}
