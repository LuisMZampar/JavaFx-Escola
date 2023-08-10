package com.example;

import java.util.ArrayList;
import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextArea txtAlunos;
    @FXML TextField txtNome;

    ArrayList<String> alunos = new ArrayList<>();
  
    public void adicionarAluno(){
        alunos.add(txtNome.getText());
        txtNome.clear();
        atualizarTela();
    }

    public void atualizarTela(){
        ordenar();
        txtAlunos.clear();
        //Para acada variavel aluno em alunos
        //Adicione o aluno no TextArea

        // alunos.forEach(nome -> txtAlunos.appendText(nome + " \n"));
        for (var aluno : alunos) {
            txtAlunos.appendText(aluno + "\n");
        }
    }

//REGRAS: (o1 < 02 => -1) ; (o1 == o2 => 0) ; (o1 > o2 => +1)
    //Anonymous class
        //Função anonima - Arrow function - lambda expression
    private void ordenar(){
        alunos.sort((o1, o2) ->  o1.compareToIgnoreCase(o2));
    }  
}


