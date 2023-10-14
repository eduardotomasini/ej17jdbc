package org.example;


import lombok.*;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;
    private Integer clave;
    private String nombre;
    private String mail;
    private Integer edad;

}