package com.unla.Grupo15OO22022.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.Grupo15OO22022.entity.Espacio;

@Repository("espacioRepository")
public interface IEspacioRepository extends JpaRepository<Espacio, Serializable>{

}
