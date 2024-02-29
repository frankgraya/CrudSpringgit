package com.example.demo.Model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion")
    private Long id;

    @ManyToOne
    @JoinColumn( name = "estudiante_id" )
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn( name = "curso_id" )
    private Curso curso;

    @Column(name = "nota_inscripcion", length = 255)
    private String nota;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inscripcion", length = 255)
    private Date fecha_inscripcion;
}
