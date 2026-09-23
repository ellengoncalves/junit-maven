package com.example;

import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("Iniciando conexão com o banco de dados...");
    }

    public static void finalizarConexao() {
        // fez algo
        LOGGER.info("Finalizando conexão com o banco de dados...");
    }

    public static void insereDados(Pessoa pessoa) {
        // insere pessoa no DB
        LOGGER.info("Inserindo dados da pessoa no banco de dados...");
    }

    public static void removeDados(Pessoa pessoa) {
        // remove pessoa do DB
        LOGGER.info("Removendo dados da pessoa do banco de dados...");
    }
}