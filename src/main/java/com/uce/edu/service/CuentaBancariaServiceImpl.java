package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepository.seleccionar(id);
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.insertar(cuentaBancaria);

	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.actualizar(cuentaBancaria);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.eliminar(id);

	}

	@Override
	public void registroDeTrasferencia(LocalDateTime fechaTrasferencia, String cuentaOrigen, String cuentaDestino,
			BigDecimal monto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crearCuentaBancaria(String nombre, String apellido, String cedula, String numero, String tipo,
			BigDecimal saldo) {
		// TODO Auto-generated method stub

		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		cuentaBancaria.setNumero(numero);
		cuentaBancaria.setSaldo(saldo);
		cuentaBancaria.setTipo(tipo);

	}

}
