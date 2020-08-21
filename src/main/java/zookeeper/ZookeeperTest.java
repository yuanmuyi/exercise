package zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * @author yuanyang
 * @date 2020/7/30 11:19
 */
public class ZookeeperTest implements Watcher {

    private static final String ZK_PATH = "127.0.0.1:2182";
    @Override
    public void process(WatchedEvent event) {
        ZookeeperTest  w = new ZookeeperTest();
        try {
            System.out.println("接收到通知");
            ZooKeeper zk = new ZooKeeper(ZK_PATH,10000, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ZookeeperTest  w = new ZookeeperTest();
        try {
            ZooKeeper  zk = new ZooKeeper(ZK_PATH, 10000, w);
            Thread.sleep(30000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
