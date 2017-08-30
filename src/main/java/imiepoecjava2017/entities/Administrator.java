package imiepoecjava2017.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Administrator" )
public class Administrator extends User {

	public Administrator() {
		super(Role.ADMINISTRATOR);
	}

}
