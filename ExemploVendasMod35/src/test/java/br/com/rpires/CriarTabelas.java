package br.com.rpires;

import javax.persistence.Persistence;

public class CriarTabelas {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("ExemploJPA").close();
    }
}