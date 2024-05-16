package bannk_management;
import java.sql.*;

public class connn {

	
	Connection c;
	Statement s;
	
public  connn() {
	try {

c = DriverManager.getConnection("jdbc:mysql:/// bannkmanagement","root","Kshitijmysql@3108");
	
s = c.createStatement();

	}catch(Exception e) {
		System.out.println(e);
	}
	

}
}