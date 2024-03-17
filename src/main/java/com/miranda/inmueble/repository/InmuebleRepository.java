package com.miranda.inmueble.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miranda.inmueble.model.Inmueble;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {

}
