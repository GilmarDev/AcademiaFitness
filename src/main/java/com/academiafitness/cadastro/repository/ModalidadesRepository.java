package com.academiafitness.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academiafitness.cadastro.model.Modalidades;


@Repository
public interface ModalidadesRepository extends JpaRepository<Modalidades, Long> {

}
