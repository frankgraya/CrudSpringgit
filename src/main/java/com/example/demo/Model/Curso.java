package com.example.demo.Model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Curso")
public class Curso
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id;

    @NotNull
    @Column(name = "nombre_curso",length = 255)
    private String nombre;

   // @NotNull
   // @Column(name = "profesor_curso",length = 255)
   // private String profesor;
    @ManyToOne
    @JoinColumn( name = "profesor_id" )
    private Profesor profesor;


    @NotNull
    @Column(name = "horas_curso",length = 20)
    private double horas;
}
