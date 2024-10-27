package com.CEP.api.controller;

import com.CEP.api.dto.CepDTO;
import com.CEP.api.http.ConsultaAPI;
import com.CEP.api.service.ConvertDados;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cep")
public class CepController {
    private final ConsultaAPI consultaAPI;

    public CepController() {
        this.consultaAPI = new ConsultaAPI();
    }


    @GetMapping("/{cep}")
    public ResponseEntity <CepDTO> obterCEP(@PathVariable String cep){
        String jsonResponse = consultaAPI.chamarAPI(cep);

        ConvertDados dados = new ConvertDados();
        CepDTO cepDTO = dados.obterDados(jsonResponse, CepDTO.class);

        return ResponseEntity.ok(cepDTO);
    }
}
