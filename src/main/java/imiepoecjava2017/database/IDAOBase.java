package imiepoecjava2017.database;

import imiepoecjava2017.entities.base.BaseEntity;

import java.sql.ResultSet;
import java.util.List;

public interface IDAOBase {
	public ResultSet executeRequest(String request);
	public void insert(BaseEntity item);
	public void update(BaseEntity item);
	public void delete(BaseEntity item);
	public BaseEntity get(double id);
	public List<BaseEntity> get();
}
