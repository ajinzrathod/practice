import java.sql.*;


class DB {
    // Append `useSSL = False` to supress warning in http Connections
    static final String url = "jdbc:mysql://localhost:3306/aj?autoReconnect=true&useSSL=false";
    static final String uname = "root";
    static final String pass = "google";

    // String url = "jdbc:mysql://localhost:3306/aj";
    // String uname = "root";
    // String pass = "password";

    static Connection connect_database(String url, String uname, String pass) throws Exception{
        System.out.print("Connecting Database... ");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Done");
        return con;
    }

    static Statement create_statement(Connection con) throws Exception{
        System.out.print("Creating statement... ");
        Statement stmt = null;
        stmt = con.createStatement();
        System.out.println("Done");
        return stmt;
    }

    static void show_data(ResultSet rs) throws Exception{
        // Fetching Result
        System.out.println("Fetching Result... ");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("given_name");

            System.out.println(id + "\t" + name);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Starting...");

        // Connecting Database
        Connection con = connect_database(url, uname, pass);

        // Creating Statement
        Statement stmt = create_statement(con);

        // Showing Result
        String sql = "SELECT * FROM tablename";
        ResultSet rs = stmt.executeQuery(sql);
        show_data(rs);

        System.out.println("Done");

        // Closing All Connections
        rs.close();
        stmt.close();
        con.close();
    }
}
