package imiepoecjava2017.entities;

import java.util.ArrayList;
import java.util.List;

public class Company extends User {

	private List<Job> jobs = new ArrayList<Job>();

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

	public Company() {
		super(Role.COMPANY);
	}
}
