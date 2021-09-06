import java.sql.*;

public class Main {


    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        MySqlConnect dbs= new MySqlConnect();
        dbs.databaseConnection();
    }

}
