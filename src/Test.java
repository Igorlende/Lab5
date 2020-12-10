import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import DataBases.СonnectPostgres;
public class Test {

    public static void main(String[] args) throws SQLException {

        Connection connection = СonnectPostgres.Connect();
        if (connection != null) {
             Statement statement = connection.createStatement();
             statement.executeUpdate("CREATE TABLE Actor (id int, text name);");
            СonnectPostgres.Disconnect(connection); }
    }


}
