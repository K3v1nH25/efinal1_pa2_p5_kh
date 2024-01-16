package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public CuentaBancaria buscar(Integer id);

	public void guardar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void borrar(Integer id);

	public void registroDeTrasferencia(LocalDateTime fechaTrasferencia, String cuentaOrigen, String cuentaDestino,
			BigDecimal monto);

	public void crearCuentaBancaria(String nombre, String apellido, String cedula, String numero, String tipo,
			BigDecimal saldo);
}
