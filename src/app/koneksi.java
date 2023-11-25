package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class koneksi {
    
    public static Connection konekKeDB(){
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root");
            mds.setPassword("");
            mds.setDatabaseName("pk2");
            mds.setServerName("localhost");
            mds.setPortNumber(3306);
            mds.setServerTimezone("Asia/Jakarta");
            Connection koneksi = mds.getConnection();
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
}
