// import neccessary libraries
import java.sql.DriverManager;
import java.sql.Connection;

public class DbConnection {

    public Connection getConnectiontosql() throws Exception {
        // create  a instance from the class encrypt 
        encrypt ery = new encrypt();
       // create the database connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                " ", ery.getDbUserName(), ery.getDbPassword());
        return connection;

    }
    
    public Connection getConnectiontoSqlServer() throws Exception{
    
    String url = "jdbc:sqlserver://THILINA-PC\\SQLEXPRESS;databaseName=TreeDb;integratedSecurity=true";
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection conn = DriverManager.getConnection(url);
    return conn;
        
    }
}
