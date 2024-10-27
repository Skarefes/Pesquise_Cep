package com.CEP.api.main;

import com.CEP.api.http.ConsultaAPI;
import com.CEP.api.model.Endereco;
import com.CEP.api.service.ConvertDados;

import java.util.Scanner;

public class Main {
  ConsultaAPI api= new ConsultaAPI();
  ConvertDados dados = new ConvertDados();
  Scanner teclado = new Scanner(System.in);

    public void exibirMenu(){
        System.out.println("Digite um CEP desejado: ");
        String cep = teclado.nextLine();

        String jsonResposta = api.chamarAPI(cep);

        Endereco endereco = dados.obterDados(jsonResposta, Endereco.class);

        System.out.println("Endereço encontrado: " + endereco);


    }
}
