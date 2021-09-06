import java.sql.*;

public class MySqlConnect {
    static String url="jdbc:mysql://localhost:3306/aayushdb";
    static String userName="root";
    static String pass="Login@251196";

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void databaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager
                .getConnection(url,userName,pass);
        if(connect!=null) {
            System.out.println("jdbc connected");
        }
        statement = connect.createStatement();
    }
}
