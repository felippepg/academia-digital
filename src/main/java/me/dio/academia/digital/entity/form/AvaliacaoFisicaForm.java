package me.dio.academia.digital.entity.form;

import lombok.Data;
import me.dio.academia.digital.entity.Aluno;

@Data
public class AvaliacaoFisicaForm {

  private Long alunoId;

  private double peso;

  private double altura;
}
