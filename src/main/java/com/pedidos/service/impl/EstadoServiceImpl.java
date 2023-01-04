package com.pedidos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pedidos.model.Estado;
import com.pedidos.repository.EstadoRepository;
import com.pedidos.service.EstadoService;
import com.pedidos.service.impl.exception.ObjectNotFoundException;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	
	@Override
	public Estado buscarEstado(Long id) {
		return estadoRepository.findById(id).orElseThrow(
				() -> {
					throw new ObjectNotFoundException(
							"Estado não encontrado ! Id: " + id + ", Tipo: " + Estado.class.getName());
				});
	}

	@Override
	public void excluirEstado(Long id) {
		Estado excluir = buscarEstado(id);
		estadoRepository.deleteById(excluir.getId());
	
	}

	@Override
	public Estado incluirEstado(Long id,String nome) {
		Estado incluir =  new Estado(id,nome);
		return estadoRepository.save(incluir);
	
	}

	@Override
	public Estado atualizarEstado(Long id, String nome) {
		Estado salvar = buscarEstado(id);
		salvar.setNome(nome);
		
		return estadoRepository.save(salvar);
	}
	
	

}
