package com.miranda.inmueble.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.miranda.inmueble.model.Inmueble;
import com.miranda.inmueble.repository.InmuebleRepository;

@Service
public class InmuebleServiceImpl implements InmuebleService {
	
	private InmuebleRepository inmuebleRepository;
	
	public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
		this.inmuebleRepository = inmuebleRepository;
	}

	@Override
	public Inmueble saveInmueble(Inmueble inmueble) {
		inmueble.setFechaCreacion(LocalDateTime.now());
		return inmuebleRepository.save(inmueble);
	}

	@Override
	public void deleteInmueble(Long id) {
		inmuebleRepository.deleteById(id);
		
	}

	@Override
	public List<Inmueble> findAllInmuebles() {
		return inmuebleRepository.findAll();
	}

}
