package designpattern.singletonpattern;

/**
 * 懒汉-非线程安全模式
 * @author: victor(yuanyang)
 * @date: 2018/5/31 23:28
 * @reviewer
 */
public class LazySingletonUnSafe {

	private static LazySingletonUnSafe lazySingletonUnSafe;

	private LazySingletonUnSafe(){

	}

	public static LazySingletonUnSafe getInstance(){
		if (lazySingletonUnSafe == null){
			lazySingletonUnSafe = new LazySingletonUnSafe();
		}
		return lazySingletonUnSafe;
	}
}
