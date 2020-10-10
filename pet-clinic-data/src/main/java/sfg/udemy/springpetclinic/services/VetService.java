package sfg.udemy.springpetclinic.services;

import sfg.udemy.springpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ari on 10.10.2020
 */
public interface VetService {
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
