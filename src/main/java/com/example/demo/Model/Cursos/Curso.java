package com.example.demo.Model.Cursos;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String nombre;

    @Column(length = 20, nullable = false)
    private double horas;

    @ManyToOne(targetEntity = Profesor.class)
    private Profesor profesor;

    @OneToMany(targetEntity = Inscripcion.class, fetch = FetchType.LAZY, mappedBy = "curso")
    private List<Inscripcion> inscripciones;
}
