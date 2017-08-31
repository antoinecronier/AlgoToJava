package imiepoecjava2017.database;

import imiepoecjava2017.entities.Skill;
import imiepoecjava2017.entities.base.BaseEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillDAO extends BaseDAO {

	public static final String TABLE = "Skill";
	public static final String ID = "id";
	public static final String LEVEL = "level";
	public static final String NAME = "name";

	public SkillDAO() {
		super(TABLE, ID);
	}

	@Override
	public BaseEntity parse(ResultSet rs) {
		Skill skill = new Skill();

		try {
			skill.setId(rs.getDouble(ID));
			skill.setLevel(rs.getInt(LEVEL));
			skill.setName(rs.getString(NAME));
		} catch (SQLException e) {
			e.printStackTrace();
			skill = null;
		}

		return skill;
	}

	@Override
	public String parse(BaseEntity item) {
		String result = "null,";
		Skill skill = (Skill) item;

		result += "'" + skill.getName() + "',";
		result += "'" + skill.getLevel() + "'";

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Skill skill = (Skill) item;

		result += NAME + " = '" + skill.getName() + "',";
		result += LEVEL + " = '" + skill.getLevel() + "'";

		return result;
	}
}
