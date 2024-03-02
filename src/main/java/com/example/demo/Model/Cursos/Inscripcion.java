package com.example.demo.Model.Cursos;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nota", columnDefinition = "TEXT")
    private String nota;

    @Column(name = "fecha_inscripcion", columnDefinition = "DATE")
    private LocalDate fechaInscripcion;

    @ManyToOne(targetEntity = Curso.class)
    private Curso curso;

    @ManyToOne(targetEntity = Estudiante.class)
    private Estudiante estudiante;
}
