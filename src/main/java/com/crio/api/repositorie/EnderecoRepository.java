package com.crio.api.repositorie;

import com.crio.api.domain.endereco.Endereco;
import com.crio.api.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {

    //Essa query pode ser usada para buscar todos os endereços de uma determinada cidade.
    @Query("SELECT e FROM Endereco e WHERE e.city = :city")
    Optional<Endereco> findByCity(String city);

    //Essa query pode ser usada para buscar todos os endereços de uma
    // determinada unidade federativa
    @Query("SELECT e FROM Endereco e WHERE e.uf = :uf")
    Optional<Usuario> findByUf(String uf);

}