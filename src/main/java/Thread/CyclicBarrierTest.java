package Thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @author yuanyang
 * @description:
 * @date 2019/6/14 11:39
 */
public class CyclicBarrierTest {
    private static CyclicBarrier cyclicBarrier;

    static class CyclicBarrierThread extends Thread{
        public void run() {

            //等待
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "到了");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + "走了");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("人到齐了，开会吧....");
            }
        });

        for(int i = 0 ; i < 5 ; i++){
            new CyclicBarrierThread().start();
        }

        System.out.println("执行完毕");
    }
}
