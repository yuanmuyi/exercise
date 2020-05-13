package Thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yuanyang
 * @description:
 * @date 2019/6/13 11:38
 */
public class ReentrantLockTest {

    public static void stateTest(ReentrantLock lock){
        lock.lock();
        System.out.println("我被锁住第一次");

        lock.lock();
        System.out.println("我被锁住第二次");

        lock.unlock();
        System.out.println("我被释放第一次");

    }

    public static void readLockTest(ReadWriteLock lock,Long time){

        try {
            lock.readLock().lock();
            System.out.println("我加了读锁");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
            System.out.println("我把读锁放开了");
        }

    }

    public static void writeLockTest(ReadWriteLock lock){
        try {
            Thread.sleep(1000);

            lock.writeLock().lock();

            System.out.println("我加了写锁");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
            System.out.println("我把写锁放开了");
        }
    }

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
//        new Thread(()-> stateTest(lock)).start();
//        //第一个线程锁少释放一次,第二个线程一直阻塞
//        new Thread(()-> stateTest(lock)).start();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        new Thread(()-> readLockTest(readWriteLock,3000l)).start();
        new Thread(()-> readLockTest(readWriteLock,10000l)).start();

        new Thread(()->writeLockTest(readWriteLock)).start();


    }
}
