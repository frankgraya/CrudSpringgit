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
@Table(name = "Profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long id;

    @NotNull
    @Column(name = "nombre_profesor",length = 255)
    private String nombre;

    @NotNull
    @Column(name = "apellido_paterno_profesor", length = 255)
    private String apellidoPaterno;

    @NotNull
    @Column(name = "apellido_materno_profesor", length = 255)
    private String apellidoMaterno;

    @NotNull
    @Column(name = "edad_profesor",length = 255)
    private int edad;

    @NotNull
    @Column(name = "correo_profesor",length = 255,unique = true)
    private String correo;
}
