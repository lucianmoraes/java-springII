package br.com.meli.w4.individual_I.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Aluno {
    private String nome;
    private Disciplina[] disciplinas;
    private float media;


    public void calcularMedia(){
        float media = 0;
        int contador=0;
        for(Disciplina d: this.disciplinas){
            media += d.getNota();
            contador++;
        }
        this.media = media/contador;
    }

}
