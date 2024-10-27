package com.CEP.api.service;

public interface iConvert {
    <T> T obterDados(String json ,Class<T> classe);
}
