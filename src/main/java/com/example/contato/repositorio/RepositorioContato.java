package com.example.contato.repositorio;

import com.example.contato.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Pessoa, Long> {

}
