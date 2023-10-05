import java.sql.*;

public class AttendanceManagementSystem {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/attendance_db";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            // Establish the JDBC connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            
            // Create a statement object
            Statement statement = connection.createStatement();
            
            // Create the attendance table if it doesn't exist
            createAttendanceTable(statement);
            
            // Insert a new attendance record
            insertAttendanceRecord(statement, "John Doe", "2023-05-30", "Present");
            
            // Update an existing attendance record
            updateAttendanceRecord(statement, "John Doe", "2023-05-30", "Absent");
            
            // Delete an attendance record
            deleteAttendanceRecord(statement, "John Doe", "2023-05-30");
            
            // Retrieve all attendance records
            retrieveAttendanceRecords(statement);
            
            // Close the statement and connection
            statement.close();
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createAttendanceTable(Statement statement) throws SQLException {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS attendance (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "date DATE NOT NULL," +
                "status VARCHAR(10) NOT NULL" +
                ")";
        statement.executeUpdate(createTableQuery);
        System.out.println("Attendance table created successfully.");
    }

    private static void insertAttendanceRecord(Statement statement, String name, String date, String status) throws SQLException {
        String insertQuery = "INSERT INTO attendance (name, date, status) VALUES ('" + name + "', '" + date + "', '" + status + "')";
        statement.executeUpdate(insertQuery);
        System.out.println("Attendance record inserted successfully.");
    }

    private static void updateAttendanceRecord(Statement statement, String name, String date, String status) throws SQLException {
        String updateQuery = "UPDATE attendance SET status = '" + status + "' WHERE name = '" + name + "' AND date = '" + date + "'";
        statement.executeUpdate(updateQuery);
        System.out.println("Attendance record updated successfully.");
    }

    private static void deleteAttendanceRecord(Statement statement, String name, String date) throws SQLException {
        String deleteQuery = "DELETE FROM attendance WHERE name = '" + name + "' AND date = '" + date + "'";
        statement.executeUpdate(deleteQuery);
        System.out.println("Attendance record deleted successfully.");
    }

    private static void retrieveAttendanceRecords(Statement statement) throws SQLException {
        String selectQuery = "SELECT * FROM attendance";
        ResultSet resultSet = statement.executeQuery(selectQuery);

        System.out.println("Attendance records:");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String date = resultSet.getString("date");
            String status = resultSet.getString("status");

            System.out.println("ID: " + id + ", Name: " + name + ", Date: " + date + ", Status: " + status);
        }

        resultSet.close();
    }
}