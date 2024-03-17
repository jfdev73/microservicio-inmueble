package com.miranda.inmueble.service;



import java.util.List;

import com.miranda.inmueble.model.Inmueble;

public interface InmuebleService {
	
	public Inmueble saveInmueble(Inmueble inmueble);
	
	public List<Inmueble> findAllInmuebles();
	public void deleteInmueble(Long id);
	
	

}
