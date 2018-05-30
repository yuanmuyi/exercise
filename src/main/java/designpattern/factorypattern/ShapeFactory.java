package designpattern.factorypattern;

import designpattern.abstractfactorypattern.AbstractFactory;
import designpattern.abstractfactorypattern.Color;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 9:20
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getDraw(String shapeType){
        if (StringUtils.isEmpty(shapeType)){
            return null;
        }
        if ("circle".equals(shapeType)){
            return new Circle();
        }
        if ("square".equals(shapeType)){
            return new Square();
        }
        if ("rectangle".equals(shapeType)){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
