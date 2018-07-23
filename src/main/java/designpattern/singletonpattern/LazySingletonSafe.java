package designpattern.singletonpattern;

/**
 * 懒汉模式-线程安全
 * @author: victor(yuanyang)
 * @date: 2018/5/31 23:45
 * @reviewer
 */
public class LazySingletonSafe {
	private volatile static LazySingletonSafe lazySingletonSafe;

	private LazySingletonSafe(){

	}

	public static  synchronized LazySingletonSafe getInstance(){
		if (lazySingletonSafe == null){
			lazySingletonSafe = new LazySingletonSafe();
		}
		return lazySingletonSafe;
	}

	public static LazySingletonSafe getInstance2(){
		if (lazySingletonSafe == null){
			synchronized (lazySingletonSafe.getClass()){
				if (lazySingletonSafe == null){
					lazySingletonSafe = new LazySingletonSafe();
				}
			}
		}
		return lazySingletonSafe;
	}
}
