package DataBases;
import DataBases.СonnectPostgres;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Postgres {
    private static final String create = "CREATE TABLE IF NOT EXISTS %s(id serial, %s, PRIMARY KEY(id));";
    private static final String drop = "DROP TABLE IF EXISTS %s";

    private static final String actor = "Actor";
    private static final String film = "Film";

    private static final String aсtor_create_attribute = "name varchar(20), surname varchar(20), birthdate date, birthplace varchar(20), rowth float8";
    private static final String film_create_attribute = "name varchar(20), director varchar(20), duration int4, country varchar(15), year int4, budget int4";

    private static void Execute(String query) throws SQLException {
        Connection connection = СonnectPostgres.Connect();
        if (connection != null) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            СonnectPostgres.Disconnect(connection);
        }
    }

    public static void createActor() throws SQLException {
        Execute(String.format(create, actor, aсtor_create_attribute));
    }

    public static void dropActor() throws SQLException {
        Execute(String.format(drop, actor));
    }

    public static void createFilm() throws SQLException {
        Execute(String.format(create, film, film_create_attribute));
    }

    public static void dropFilm() throws SQLException {
        Execute(String.format(drop, film));
    }


}


