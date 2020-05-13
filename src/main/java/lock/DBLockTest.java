package lock;

/**
 * @author yuanyang
 * @description:
 * @date 2018/8/2 16:07
 */
public class DBLockTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DbLock.doSomeByLock(new DbLock.CallBack() {
                    @Override
                    public void doSome() {
                        for (int i = 0; i < 100; i++) {
                            System.out.println(i%2);
                        }
                    }
                });
            }
        });



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DbLock.doSomeByLock(new DbLock.CallBack() {
                    @Override
                    public void doSome() {
                        System.out.println("end");
                    }
                });
            }
        });

        t1.start();
        t2.start();
    }



}
