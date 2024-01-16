package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.service.ICuentaBancariaService;
import com.uce.edu.service.IPropietarioService;

@SpringBootApplication
public class Efinal1Pa2P5KhApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	private IPropietarioService iPropietarioService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//Funcionalidad del crud
		
		Propietario propietario = new Propietario();
		propietario.setNombre("kevin");
		propietario.setApellido("hurtado");
		propietario.setCedula("1724");

		Propietario propietario2 = new Propietario();
		propietario2.setNombre("kevin");
		propietario2.setApellido("hurtado");
		propietario2.setCedula("1724");

		this.iPropietarioService.guardar(propietario);
		this.iPropietarioService.guardar(propietario2);

		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		cuentaBancaria.setNumero("123");
		cuentaBancaria.setSaldo(new BigDecimal(500));
		cuentaBancaria.setTipo("Ahorros");

		CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
		cuentaBancaria2.setNumero("456");
		cuentaBancaria2.setSaldo(new BigDecimal(580));
		cuentaBancaria2.setTipo("Corriente");
		this.iCuentaBancariaService.guardar(cuentaBancaria2);
		this.iCuentaBancariaService.guardar(cuentaBancaria);

		//Ingresar una cuenta 
		// this.iCuentaBancariaService.crearCuentaBancaria("kevin", "Hurtado", "1724",
		// "123", "Ahorros",
		// new BigDecimal(20));

	}

}
