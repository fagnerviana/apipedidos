package com.pedidos.service;

import com.pedidos.model.Estado;

public interface EstadoService {
	
	Estado buscarEstado(Long id);
	public void excluirEstado(Long id);
	Estado incluirEstado(Long id, String nome);
	Estado atualizarEstado(Long id, String nome);
	
}
