package sfg.udemy.springpetclinic.services;

import sfg.udemy.springpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Ari on 10.10.2020
 */
public interface OwnerService {
	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
