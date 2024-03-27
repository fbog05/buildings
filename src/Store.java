import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Store {
    
    public void save(ArrayList<Building> buildingList) throws SQLException{

        String user = "root";
        String pass = "";
        String url = "jdbc:mariadb://localhost:3306/argus";

        Connection conn = DriverManager.getConnection(url, user, pass);
        String sql = "insert into buildings(id, city, address, busage, size, price) values(?,?,?,?,?,?)";
        for (Building building : buildingList) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, building.id);
            ps.setString(2, building.city);
            ps.setString(3, building.address);
            ps.setString(4, building.usage);
            ps.setInt(5, building.size);
            ps.setDouble(6, building.price);
            ps.execute();
        }
        conn.close();
    }
}
