package me.dio.academia.digital.entity.form;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class AlunoForm {
  @NotEmpty(message = "Preencha todos os campos corretamente")
  @Size(min = 3, max = 100, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String nome;

  @NotEmpty(message = "Preencha os campos corretamente")
  @CPF(message = "Insira um CPF válido")
  private String cpf;

  @NotEmpty(message = "Preencha todos os campos corretamente")
  @Size(min = 3, max = 100, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "Preencha todos os campos corretamente")
  @Past(message = "Data '${validatedValue} é inválida")
  private LocalDate dataDeNascimento;
}
