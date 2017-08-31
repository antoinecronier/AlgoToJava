package imiepoecjava2017.database;

import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.Skill;
import imiepoecjava2017.entities.base.BaseEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO extends BaseDAO {

	public static final String TABLE = "Candidate";
	public static final String ID = "id";
	public static final String LASTNAME = "lastname";
	public static final String FIRSTNAME = "firstname";
	public static final String LOGIN = "login";
	public static final String PASSWORD = "password";

	public static final String CANDIDATE_SKILL = "candidateskill";
	public static final String ID_CANDIDATE = "id_Candidate";
	public static final String ID_SKILL = "id_Skill";

	public CandidateDAO() {
		super(TABLE, ID);
	}

	@Override
	public BaseEntity parse(ResultSet rs) {
		Candidate candidate = new Candidate();

		try {
			candidate.setId(rs.getDouble(ID));
			candidate.setLastname(rs.getString(LASTNAME));
			candidate.setFirstname(rs.getString(FIRSTNAME));
			candidate.setLogin(rs.getString(LOGIN));
			candidate.setPassword(rs.getString(PASSWORD));
		} catch (SQLException e) {
			e.printStackTrace();
			candidate = null;
		}

		return candidate;
	}

	@Override
	public String parse(BaseEntity item) {
		String result = "null,";
		Candidate candidate = (Candidate) item;

		result += "'" + candidate.getLastname() + "',";
		result += "'" + candidate.getFirstname() + "',";
		result += "'" + candidate.getLogin() + "',";
		result += "'" + candidate.getPassword() + "'";

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Candidate candidate = (Candidate) item;

		result += LASTNAME + " = '" + candidate.getLastname() + "',";
		result += FIRSTNAME + " = '" + candidate.getFirstname() + "',";
		result += LOGIN + " = '" + candidate.getLogin() + "',";
		result += PASSWORD + " = '" + candidate.getPassword() + "'";

		return result;
	}

	public Candidate getSkills(Candidate candidate) {
		ResultSet rs = executeQuery("SELECT * FROM " + CANDIDATE_SKILL
				+ " WHERE " + ID_CANDIDATE + " = " + candidate.getId());
		List<Double> skillsId = new ArrayList<Double>();
		try {
			while (rs.next()) {
				skillsId.add(rs.getDouble(ID_SKILL));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		BaseDAO skillDAO = new SkillDAO();

		for (Double id : skillsId) {
			candidate.getSkills().add((Skill) skillDAO.get(id));
		}

		return candidate;
	}

	public int insertSkills(Candidate candidate) {
		int result = 0;
		deleteSkills(candidate);
		for (Skill skill : candidate.getSkills()) {
			result += executeUpdate("INSERT INTO " + CANDIDATE_SKILL
					+ " VALUES(" + candidate.getId() + "," + skill.getId()
					+ ")");
		}
		return result;
	}

	public int deleteSkills(Candidate candidate) {
		return executeUpdate("DELETE FROM " + CANDIDATE_SKILL + " WHERE "
				+ ID_CANDIDATE + " = " + candidate.getId());
	}
}
