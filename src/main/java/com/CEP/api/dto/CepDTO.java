package com.CEP.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CepDTO(String cep,
                     String logradouro,
                     String complemento,
                     String bairro,
                     String localidade,
                     String uf,
                     String ddd) {
}
