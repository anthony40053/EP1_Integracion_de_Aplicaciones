package com.example.demo.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/Listar")

    public List<Alumno> getALLAlumno()
    {
        Alumno alumno = Alumno.builder()
                .id(1L)
                .name("Julio")
                .surname("Flores")
                .DNI("95623185")
                .curso("historia")
                .build();
        Alumno alumno2 = Alumno.builder()
                .id(1L)
                .name("Lucia")
                .surname("Flores")
                .DNI("95623205")
                .curso("matematicas")
                .build();

        return List.of(alumno,alumno2);
    }
}
