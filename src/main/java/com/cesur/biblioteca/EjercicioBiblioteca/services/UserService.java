package com.cesur.biblioteca.EjercicioBiblioteca.services;

import java.util.ArrayList;

import com.cesur.biblioteca.EjercicioBiblioteca.model.ReservationDTO;

public interface UserService {

	ReservationDTO reserveBook(Long bookId, Long userId);
	ReservationDTO cancelReservation(Long bookId, Long userId);
	ArrayList<ReservationDTO> getAllReservations(Long userId);
}
