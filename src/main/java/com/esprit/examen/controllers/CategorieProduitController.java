package com.esprit.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.services.ICategorieProduitService;
import io.swagger.annotations.Api;

@RestController
@Api(tags = "Gestion des categories Produit")
@RequestMapping("/categorieProduit")
//@CrossOrigin(origins = "*")
public class CategorieProduitController {

	@Autowired
	ICategorieProduitService categorieProduitService;
	
	// http://localhost:8089/SpringMVC/categorieProduit/retrieve-all-categorieProduit
	@GetMapping("/retrieve-all-categorieProduit")
	@ResponseBody
	public List<CategorieProduit> getCategorieProduit() {

		return categorieProduitService.retrieveAllCategorieProduits();
	}

	@GetMapping("/retrieve-categorieProduit/{categorieProduit-id}")
	@ResponseBody
	public CategorieProduit retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
		return categorieProduitService.retrieveCategorieProduit(categorieProduitId);
	}

	// http://localhost:8089/SpringMVC/categorieProduit/add-categorieProduit
	@PostMapping("/add-categorieProduit")
	@ResponseBody
	public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
		return categorieProduitService.addCategorieProduit(cp);
	}

	@DeleteMapping("/remove-categorieProduit/{categorieProduit-id}")
	@ResponseBody
	public void removeCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
		categorieProduitService.deleteCategorieProduit(categorieProduitId);
	}

	// http://localhost:8089/SpringMVC/categorieProduit/modify-categorieProduit
	@PutMapping("/modify-categorieProduit")
	@ResponseBody
	public CategorieProduit modifyCategorieProduit(@RequestBody CategorieProduit categorieProduit) {
		return categorieProduitService.updateCategorieProduit(categorieProduit);
	}

	
}
