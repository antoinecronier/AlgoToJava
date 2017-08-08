package imiepoecjava2017.entities;

import java.util.ArrayList;

/**
 * This class is an entity that represent an element extract from the real.
 * @author tactfactory
 *
 */
public class User {
	private long id;
	private String firstname;
	private String lastname;
	private String login;
	private String password;
	private ArrayList<Role> roles;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 *
	 * @return
	 */
	public ArrayList<Role> getRoles() {
		return roles;
	}

	/**
	 *
	 * @param roles
	 */
	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}

	/**
	 * Empty constructor (create by default if no other describes).
	 */
	public User(){
		this.roles = new ArrayList<Role>();
	}

	public User(long id, String firstname, String lastname, String login,
			String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
		this.password = password;
		this.roles = new ArrayList<Role>();
	}

	public User(long id, String firstname, String lastname, String login,
			String password, ArrayList<Role> roles) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
		this.password = password;
		this.roles = roles;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", login=" + login + ", password=" + password
				+ ", roles=" + roles + "]";
	}
}
