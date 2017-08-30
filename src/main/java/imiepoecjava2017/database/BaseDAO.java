package imiepoecjava2017.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseDAO implements IDAOBase {

	/* (non-Javadoc)
	 * @see imiepoecjava2017.database.IDAOBase#executeRequest(java.lang.String)
	 */
	@Override
	public ResultSet executeRequest(String request) {
		ResultSet result = null;

		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			result = stmt.executeQuery(request);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	// Statement stmt = con.createStatement();
	// ResultSet rs = stmt.executeQuery("select * from emp");
	// while (rs.next())
	// System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
	// + rs.getString(3));
	// con.close();

}
