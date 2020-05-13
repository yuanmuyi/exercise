package Thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yuanyang
 * @description:
 * @date 2019/6/13 14:28
 */
public class ReadWriteLockDemo {
    private  int number = 0;

    // 可重入读写锁
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        lock.readLock().lock();
        try {
            System.out.println("当前的值为"  + this.number);
        } finally {
            lock.readLock().unlock();
        }
    }

    public void set(Integer value){
        lock.writeLock().lock();
        try {
            Thread.sleep(1000);
            System.out.println(String.format("当前线程{%s}正在进行写操作{%s}", Thread.currentThread().getName(),value));
            this.setNumber(value);
        }catch (Exception e){

        }finally {
            lock.writeLock().unlock();
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ReadWriteLock getLock() {
        return lock;
    }

    public void setLock(ReadWriteLock lock) {
        this.lock = lock;
    }
}
