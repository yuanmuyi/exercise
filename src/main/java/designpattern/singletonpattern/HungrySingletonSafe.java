package designpattern.singletonpattern;

/**
 * 饿汉模式-线程安全
 * @author: victor(yuanyang)
 * @date: 2018/5/31 23:49
 * @reviewer
 */
public class HungrySingletonSafe {

	private static HungrySingletonSafe hungrySingletonSafe = new HungrySingletonSafe();

	private HungrySingletonSafe(){

	}

	public static HungrySingletonSafe getInstance(){
		return hungrySingletonSafe;
	}
}
