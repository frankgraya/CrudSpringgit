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
@Table(name = "Estudiante")
public class Estudiante
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long id;

    @NotNull
    @Column(name = "nombre_estudiante",length = 255)
    private String nombre;

    @NotNull
    @Column(name = "apellido_paterno_estudiante", length = 255)
    private String apellidoPaterno;

    @NotNull
    @Column(name = "apellido_materno_estudiante", length = 255)
    private String apellidoMaterno;

    @NotNull
    @Column(name = "edad_estudiante",length = 10)
    private int edad;

    @NotNull
    @Column(name = "correo_estudiante",length = 255,unique = true)
    private String correo;
}
