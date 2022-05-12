package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query(value = "SELECT * FROM aluno WHERE data_de_nascimento = :dataDeNascimento", nativeQuery = true)
    List<Aluno> findByDataDeNascimentoQuery(LocalDate dataDeNascimento);
    //List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
