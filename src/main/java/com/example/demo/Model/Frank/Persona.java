package com.example.demo.Model.Frank;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 255)
    private String nombre;

    @Column(name = "apellidoPaterno", length = 156)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", length = 23)
    private String apellidoMaterno;

    @Column(name = "edad",length = 123)
    private int edad;
}
