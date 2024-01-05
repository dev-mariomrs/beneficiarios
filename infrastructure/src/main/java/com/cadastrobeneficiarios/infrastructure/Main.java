package com.cadastrobeneficiarios.infrastructure;

import com.cadastrobeneficiarios.application.UseCase;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}