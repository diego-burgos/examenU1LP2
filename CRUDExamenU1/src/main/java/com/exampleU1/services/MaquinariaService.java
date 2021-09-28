package com.exampleU1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleU1.interfaces.IMaquinaria;
import com.exampleU1.iservice.ImaquinariaService;
import com.exampleU1.models.Maquinaria;

@Service
public class MaquinariaService implements ImaquinariaService{
	@Autowired
	private IMaquinaria data;
	
	@Override
	public List<Maquinaria> listar(){
		return (List<Maquinaria>)data.findAll();
	}

	@Override
	public Optional<Maquinaria> buscarId(int id) {
		return data.findById(id);
	}

	@Override
	public int guardar(Maquinaria maqui) {
		int res=0;
		Maquinaria maquinaria=data.save(maqui);
		if(maquinaria.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(int id) {
		data.deleteById(id);
	}
}
