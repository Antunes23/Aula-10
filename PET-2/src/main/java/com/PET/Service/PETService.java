package com.PET.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.PET.Entities.PET;
import com.PET.Repository.PETRepository;

@Service
public class PETService {
	private final PETRepository petRepository;

	public PETService(PETRepository petRepository) {
		this.petRepository = petRepository;
	}

	public PET salvaPET(PET pet) {
		return petRepository.save(pet);
	}

	public PET getPETById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	public List<PET> getPETAll() {
		return petRepository.findAll();
	}

	public PET alterarPET(Long id, PET alterarPET) {
		Optional<PET> existePET = petRepository.findById(id);
		if (existePET.isPresent()) {
			alterarPET.setId(id);
			return petRepository.save(alterarPET);
		} else {
			return null;
		}
	}

	public boolean deletePET(Long id) {
		Optional<PET> existePET = petRepository.findById(id);
		if (existePET.isPresent()) {
			petRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
}
