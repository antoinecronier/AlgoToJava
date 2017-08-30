package imiepoecjava2017.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Candidate" )
public class Candidate extends User {

	private List<Job> jobs = new ArrayList<Job>();
	private List<Company> companies = new ArrayList<Company>();
	private List<Skill> skills = new ArrayList<Skill>();

	/**
	 * @return the jobs
	 */
	public List<Job> getJobs() {
		return jobs;
	}
	/**
	 * @param jobs the jobs to set
	 */
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	/**
	 * @return the companies
	 */
	public List<Company> getCompanies() {
		return companies;
	}
	/**
	 * @param companies the companies to set
	 */
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
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

	public Candidate() {
		super(Role.CANDIDATE);
		this.companies = new ArrayList<Company>();
		this.jobs = new ArrayList<Job>();
		this.skills = new ArrayList<Skill>();
	}
}
