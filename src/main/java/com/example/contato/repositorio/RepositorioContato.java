package com.example.contato.repositorio;

import com.example.contato.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioContato extends JpaRepository<Pessoa, Long> {

}
