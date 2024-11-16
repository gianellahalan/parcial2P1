package com.ISSD.programacion1parcial.repository;

import com.ISSD.programacion1parcial.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    //Consulta para encontrar todos los usuarios activos
    @Query("SELECT u FROM Client u WHERE u.isActive = true")
    List<Client> findAllActive();

    //Consulta para encontrar un usuario activo por ID
    @Query("SELECT u FROM Client u WHERE u.id = :id AND u.isActive = true")
    Optional<Client> findActiveById(@Param("id") long id);

    //Consulta para encontrar un usuario activo por referencia
    @Query("SELECT u FROM Client u WHERE u.reference = :reference AND u.isActive = true")
    Optional<Client> findActiveByReference(@Param("reference") String reference);

    //Consulta para encontrar un usuario activo por email con roles
    @Query("SELECT u FROM Client u WHERE u.email = :email AND u.isActive = true")
    Optional<Client> findActiveByEmail(@Param("email") String email);

}