package jvm;

/**
 * @author yuanyang
 * @description:
 * @date 2018/10/30 11:10
 */
public class JstackTest {
    public static void main(String[] args) {
       Thread thread = new Thread(new Thread1());
       thread.start();
    }

    static class Thread1 implements Runnable{

        @Override
        public void run() {
            while (true){
                System.out.println(1);
            }
        }
    }
}
