package sfg.udemy.springpetclinic.services;

import sfg.udemy.springpetclinic.model.Owner;

/**
 * Created by Ari on 10.10.2020
 */
public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
