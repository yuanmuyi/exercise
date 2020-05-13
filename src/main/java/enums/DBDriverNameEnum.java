package enums;

/**
 * @author yuanyang
 * @description:数据库驱动名枚举
 * @date 2018/8/2 15:43
 */
public enum DBDriverNameEnum {

    DRIVER_MYSQL("com.mysql.cj.jdbc.Driver"),
    DRIVER_ORACLE("oracle.jdbc.driver.OracleDriver"),
    DRIVER_POSTGRES("org.postgresql.Driver"),

    ;

    private String driverName;

    DBDriverNameEnum(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
