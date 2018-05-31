package designpattern.singletonpattern;

/**
 * 登记式/静态内部类
 * @author: victor(yuanyang)
 * @date: 2018/5/31 23:55
 * @reviewer
 */
public class StaticClassSingletonSafe {

	private static class Singleton{
		private final static StaticClassSingletonSafe staticClassSingletonSafe = new StaticClassSingletonSafe();
	}

	private StaticClassSingletonSafe(){

	}

	public StaticClassSingletonSafe getInstance(){
		return Singleton.staticClassSingletonSafe;
	}
}
