package com.banco;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static List<Conta> adicionar = new ArrayList<>();
    
    public void add(Conta a){
        adicionar.add(a);

    }

    public List<Conta> armazenar(){
        return adicionar;
    }

}
