package imiepoecjava2017.entities;

import imiepoecjava2017.entities.base.DBItem;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Skill" )
public class Skill extends DBItem {
	private String name;
	private int level;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

}
