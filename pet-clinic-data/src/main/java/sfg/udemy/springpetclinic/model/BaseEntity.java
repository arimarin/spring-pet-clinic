package sfg.udemy.springpetclinic.model;

import java.io.Serializable;

/**
 * Created by Ari on 10.10.2020
 */
public class BaseEntity implements Serializable {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// Not needed but still quite nice
	public boolean isNew() {
		return this.id == null || this.id == 0;
	}
}
