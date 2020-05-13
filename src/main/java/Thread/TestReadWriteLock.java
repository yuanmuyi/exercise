package Thread;

import java.util.Random;

/**
 * @author yuanyang
 * @description:
 * @date 2019/6/13 14:28
 */
public class TestReadWriteLock {

    public static void main(String[] args) {
        ReadWriteLockDemo demo = new ReadWriteLockDemo();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                demo.set(new Random().nextInt(101));
            },"write:" + (i+1)).start();
        }


        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                demo.read();
            }).start();
        }
    }

}
