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
@Table(name = "estudiante")
public class Estudiante
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(150)", nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno",columnDefinition = "VARCHAR(150)", nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno",columnDefinition = "VARCHAR(150)", nullable = false)
    private String apellidoMaterno;

    @Column(length = 10, nullable = false)
    private Integer edad;

    @Column(columnDefinition = "VARCHAR(150)",unique = true)
    private String correo;

    @OneToMany(targetEntity = Inscripcion.class, fetch = FetchType.LAZY, mappedBy = "estudiante")
    private List<Inscripcion> inscripciones;
}