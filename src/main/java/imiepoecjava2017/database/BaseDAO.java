package imiepoecjava2017.database;

import imiepoecjava2017.entities.base.BaseEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDAO implements IDAOBase {

	private String table;
	private String id;

	/**
	 * @return the table
	 */
	public String getTable() {
		return table;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	public BaseDAO(String table, String id) {
		this.table = table;
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#executeRequest(java.lang.String)
	 */
	@Override
	public ResultSet executeQuery(String request) {
		ResultSet result = null;

		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			result = stmt.executeQuery(request);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#executeRequest(java.lang.String)
	 */
	@Override
	public int executeUpdate(String request) {
		int result = 0;

		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			result = stmt.executeUpdate(request);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#executeRequest(java.lang.String)
	 */
	@Override
	public BaseEntity executePreparedStatement(BaseEntity item, String request) {

		try {
			PreparedStatement prest;

			prest = DBManager.getInstance().getCon()
					.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
			prest.executeUpdate();
			ResultSet rs = prest.getGeneratedKeys();
			if (rs.next()) {
				item.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			item = null;
		}

		return item;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * imiepoecjava2017.database.IDAOBase#delete(imiepoecjava2017.entities.base
	 * .BaseEntity)
	 */
	@Override
	public int delete(BaseEntity item) {
		return executeUpdate("DELETE FROM " + table + " WHERE " + id + " = "
				+ item.getId());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#delete()
	 */
	@Override
	public int delete() {
		return executeUpdate("DELETE FROM " + table);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#get(double)
	 */
	@Override
	public BaseEntity get(double id) {
		ResultSet rs = executeQuery("SELECT * FROM " + table + " WHERE "
				+ this.id + " = " + id);
		BaseEntity entity = null;
		try {
			rs.next();
			entity = parse(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return entity;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#get()
	 */
	@Override
	public List<BaseEntity> get() {
		List<BaseEntity> entities = new ArrayList<BaseEntity>();
		ResultSet rs = executeQuery("SELECT * FROM " + table);

		try {
			while (rs.next()) {
				entities.add(parse(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return entities;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * imiepoecjava2017.database.IDAOBase#insert(imiepoecjava2017.entities.base
	 * .BaseEntity)
	 */
	@Override
	public BaseEntity insert(BaseEntity item) {
		return executePreparedStatement(item,"INSERT INTO " + table + " VALUES(" + parse(item) + ")");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * imiepoecjava2017.database.IDAOBase#update(imiepoecjava2017.entities.base
	 * .BaseEntity)
	 */
	@Override
	public int update(BaseEntity item) {
		return executeUpdate("UPDATE " + table + " SET " + parseUpdate(item) + " WHERE " + id + " = " + item.getId());
	}
}
