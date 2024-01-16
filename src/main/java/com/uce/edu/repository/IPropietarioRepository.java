package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario seleccionar(Integer id);

	public void insertar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(Integer id);

	public Propietario seleccionarPórCedula(String cedula);

}
