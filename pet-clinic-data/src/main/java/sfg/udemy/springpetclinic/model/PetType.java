package sfg.udemy.springpetclinic.model;

/**
 * Created by Ari on 26.09.2020
 */
public class PetType extends BaseEntity {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
