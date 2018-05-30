package designpattern.abstractfactorypattern;

import designpattern.factorypattern.Shape;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/30 23:44
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (StringUtils.isEmpty(color)){
            return null;
        }
        if ("red".equals(color)){
            return new Red();
        }
        if ("green".equals(color)){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getDraw(String shape) {

        return null;
    }
}
