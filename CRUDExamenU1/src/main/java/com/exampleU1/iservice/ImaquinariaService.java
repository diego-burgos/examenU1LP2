package com.exampleU1.iservice;

import java.util.List;
import java.util.Optional;

import com.exampleU1.models.Maquinaria;

public interface ImaquinariaService {
	public List<Maquinaria> listar();
	public Optional<Maquinaria> buscarId(int id);
	public int guardar(Maquinaria maqui);
	public void eliminar(int id);
}
