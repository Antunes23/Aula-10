package com.PET.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PET.Entities.PET;
import com.PET.Service.PETService;

@RestController
@RequestMapping("pet")
public class PETController {

	private final PETService petService;

	public PETController(PETService petService) {
		this.petService = petService;
	}

	@GetMapping("/")
	public ResponseEntity<List<PET>> getAllPET() {
		List<PET> pets = petService.getPETAll();
		return ResponseEntity.ok(pets);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PET> getPETById(@PathVariable Long id) {
		PET pet = petService.getPETById(id);
		if (pet != null) {
			return ResponseEntity.ok(pet);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/")
	public ResponseEntity<PET> criarPET(@RequestBody PET pet) {
		PET criarPET = petService.salvaPET(pet);
		return ResponseEntity.status(HttpStatus.CREATED).body(criarPET);
	}

	@PutMapping("/{id}")
	public ResponseEntity<PET> alterarPET(@PathVariable Long id, @RequestBody PET pet) {
		PET alterarPET = petService.alterarPET(id, pet);
		if (alterarPET != null) {
			return ResponseEntity.ok(alterarPET);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePET(@PathVariable Long id) {
		boolean deleted = petService.deletePET(id);
		if (deleted) {
			return ResponseEntity.ok().body("Pet excluído com sucesso!!!");
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
