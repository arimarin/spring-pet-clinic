package sfg.udemy.springpetclinic.services;

import sfg.udemy.springpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ari on 10.10.2020
 */
public interface PetService {
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
