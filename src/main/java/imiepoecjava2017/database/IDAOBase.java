package imiepoecjava2017.database;

import imiepoecjava2017.entities.base.BaseEntity;

import java.sql.ResultSet;
import java.util.List;

public interface IDAOBase {
	public ResultSet executeQuery(String request);
	public int executeUpdate(String request);
	public BaseEntity executePreparedStatement(BaseEntity item, String request);
	public BaseEntity parse(ResultSet rs);
	public String parse(BaseEntity item);
	public String parseUpdate(BaseEntity item);
	public BaseEntity insert(BaseEntity item);
	public int update(BaseEntity item);
	public int delete(BaseEntity item);
	public int delete();
	public BaseEntity get(double id);
	public List<BaseEntity> get();
}
