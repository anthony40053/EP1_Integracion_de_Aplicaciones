package com.example.demo.Alumno;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Alumno {
    Long id;
    String name;
    String surname;
    String DNI;
    String curso;

}
