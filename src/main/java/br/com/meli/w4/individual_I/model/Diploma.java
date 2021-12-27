package br.com.meli.w4.individual_I.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diploma {
    private String mensagem;
    private Float media;
    private Aluno aluno;

    public  Diploma gerarDiploma(Aluno aluno){
        this.media = aluno.getMedia();
        String msg = "";
        msg = "Sr(a). " + aluno.getNome() + " sua média de notas é: " + media;
        if (media> 9){
            msg += "\n Parabéns, pela média acima de 9!";
        }
        Diploma di = new Diploma(msg, media, aluno);

        return di;
    }
}
