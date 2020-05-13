package lock;

import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author yuanyang
 * @description:数据库锁
 * @date 2018/8/2 15:27
 */
public class DbLock {

    private final static String LOCK_SQL = " select * from locktable where id = 1 for update ";

    public static interface CallBack{
        public void doSome();
    }
    public static void doSomeByLock(CallBack callBack){
        Connection connection = DBUtils.getDBConnection();

        try {
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement(LOCK_SQL);
            ResultSet resultSet = stmt.executeQuery();

            callBack.doSome();

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
