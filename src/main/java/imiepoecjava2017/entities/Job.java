package imiepoecjava2017.entities;

import java.util.ArrayList;
import java.util.List;

public class Job {

	private List<Candidate> candidates = new ArrayList<Candidate>();

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


}
