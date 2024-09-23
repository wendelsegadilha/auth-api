package br.com.wendelsegadilha.authapi.repositories;

import br.com.wendelsegadilha.authapi.entities.Role;
import br.com.wendelsegadilha.authapi.entities.RoleEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(RoleEnum name);
}
