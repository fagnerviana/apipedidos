package com.pedidos.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pedidos.model.Estado;
import com.pedidos.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;
	
	@PostMapping("/incluir")
	public Estado incluirEstado(@RequestBody Long id, String nome) {
		//Estado incluir= new Estado(id,nome);
		return estadoService.incluirEstado(id,nome);
	}
	
	@GetMapping("/{id}")
	public Estado buscarEstado(@PathVariable("id")Long  id) {
		return estadoService.buscarEstado(id);
	}
	
	@PatchMapping("/excluir/{id}")
	public void excluirEstado(@PathVariable("id") Long id) {
		estadoService.excluirEstado(id);
	}
	@PatchMapping("/atualizar/{estadoId}")
	public Estado atualizarEstado(@PathVariable("estadoId") Long id,@RequestParam("estadoAtualizado") String nome) {
		buscarEstado(id);
		
		return estadoService.atualizarEstado(id,nome);
	}
	
}
