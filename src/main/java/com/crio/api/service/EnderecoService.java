package com.crio.api.service;

import com.crio.api.domain.endereco.Endereco;
import com.crio.api.domain.endereco.EnderecoRequestDTO;
import com.crio.api.domain.usuario.Usuario;
import com.crio.api.repositorie.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco createEndereco(EnderecoRequestDTO data){
        //cria um endereco vazio
        Endereco newEndereco = new Endereco();
        //preenche os dados do endereco
        newEndereco.setCity(data.city());
        newEndereco.setUf(data.uf());
        enderecoRepository.save(newEndereco);
        return newEndereco;
    }


    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    public Endereco getEnderecoById(UUID id) {
        return enderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }

    public Endereco updateEndereco(UUID id, EnderecoRequestDTO enderecoRequestDTO) {
        Endereco updateEndereco = getEnderecoById(id);
        updateEndereco.setCity(enderecoRequestDTO.city());
        updateEndereco.setUf(enderecoRequestDTO.uf());
        return enderecoRepository.save(updateEndereco);
    }
    public void deleteEndereco(UUID id){
        Endereco endereco = getEnderecoById(id);
        enderecoRepository.delete(endereco);
    }

    public Optional<Endereco> findByCity(String city) {
        Optional<Endereco> endereco = enderecoRepository.findByCity(city);
        return  endereco;
    }

    public Optional<Endereco> findByUf(String uf) {
        Optional<Endereco> endereco = enderecoRepository.findByUf(uf);
        return  endereco;
    }
}
