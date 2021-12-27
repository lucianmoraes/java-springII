package br.com.meli.w4.individual_I.controller;

import java.util.concurrent.atomic.AtomicLong;

import br.com.meli.w4.individual_I.model.Aluno;
import br.com.meli.w4.individual_I.model.Diploma;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiplomaController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/diploma")
    public ResponseEntity<Diploma> greeting(@RequestBody Aluno aluno) {
        aluno.calcularMedia();
        aluno.getMedia();
        Diploma d = new Diploma();
        d = d.gerarDiploma(aluno);

        return ResponseEntity.ok(d);
    }

}