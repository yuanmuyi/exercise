package utils;

import enums.DBDriverNameEnum;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author yuanyang
 * @description:数据库工具
 * @date 2018/8/2 15:35
 */
public class DBUtils {

    public static Connection getDBConnection(){
        Connection connection = null;
        try {
            Class.forName(DBDriverNameEnum.DRIVER_MYSQL.getDriverName());
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        getDBConnection();
    }
}
