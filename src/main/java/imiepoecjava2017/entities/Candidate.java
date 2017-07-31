package imiepoecjava2017.entities;

import java.util.ArrayList;
import java.util.List;

public class Candidate extends User {

	private List<Job> jobs = new ArrayList<Job>();
	private List<Company> companies = new ArrayList<Company>();
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

	public Candidate() {
		super(Role.CANDIDATE);
	}
}
