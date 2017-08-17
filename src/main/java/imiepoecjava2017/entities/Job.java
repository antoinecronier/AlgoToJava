package imiepoecjava2017.entities;

import java.util.ArrayList;
import java.util.List;

public class Job {

	private Company company;
	private List<Candidate> candidates = new ArrayList<Candidate>();
	private List<Skill> skills = new ArrayList<Skill>();

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the candidate
	 */
	public List<Candidate> getCandidates() {
		return candidates;
	}

	/**
	 * @param candidate the candidate to set
	 */
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	/**
	 * @return the skills
	 */
	public List<Skill> getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

}
