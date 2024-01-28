import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegDao {

	void addDetail(RegBean r) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		 
		 String s="insert into employee values(?,?,?,?,?,?,?)";
		 
		 PreparedStatement ps=conn.prepareStatement(s);
		 
		 ps.setString(1, r.getFname());
		 ps.setString(2, r.getLname());
		 ps.setLong(3, r.getContact());
		 ps.setString(4, r.getDob());
		 ps.setString(5, r.getGenden());
		 ps.setString(6, r.getEmail());
		 ps.setString(7, r.getPass());
		 
		 ps.execute();
		 conn.close();
	}
}
