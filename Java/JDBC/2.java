import java.sql.*;

class TestDB1 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/aj";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String USER = "root";
    static final String PASSWORD = "google";

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Creating connection...");
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Creating statement...");
            stmt = con.createStatement();

            String sql = "SELECT * FROM emp ORDER BY salary DESC";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nempid\tname\tsalary");
            while (rs.next()) {
                int id = rs.getInt("empid");
                String name = rs.getString("name");
                String salary = rs.getString("salary");

                System.out.println(id + "\t" + name + "\t" + salary);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
