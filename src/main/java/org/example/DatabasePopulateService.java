package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    private static final String POPULATE_DB_SQL = "src/main/resources/sql/populate_db.sql";

    public static void main(String[] args) {
        try(PreparedStatement preparedStatement = Database.getConnection().prepareStatement(POPULATE_DB_SQL)){
            preparedStatement.execute(SQLReader.read(POPULATE_DB_SQL));
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
