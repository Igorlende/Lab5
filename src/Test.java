import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import DataBases.СonnectPostgres;
import DataBases.Postgres;

import static java.lang.Thread.sleep;

public class Test {

    public static void main(String[] args) throws SQLException {

        try {
            Postgres.createActor();
            Postgres.createFilm();

            sleep(2000);


            Postgres.dropActor();
            Postgres.dropFilm();

        }
        catch(SQLException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
    }


}
