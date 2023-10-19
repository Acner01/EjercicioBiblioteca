package com.cesur.biblioteca.EjercicioBiblioteca.model;

import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
public class UserDTO {

	private Long id;
	private String nombre;
	private String correoElectronico;
}
