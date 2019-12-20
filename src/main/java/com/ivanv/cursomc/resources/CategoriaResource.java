package com.ivanv.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivanv.cursomc.domain.Categoria;
import com.ivanv.cursomc.services.CategoriaService;

@RestController //Anotacao para classe de Resource
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//Instancia automaticamente o objeto Service
	@Autowired
	private CategoriaService service;
	
	//Indica o caminho do endpoint e o metodo REST usado
	//Metodo que faz a busca no endpoint e retorna um objeto ResponseEntity de qualquer tipo
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
