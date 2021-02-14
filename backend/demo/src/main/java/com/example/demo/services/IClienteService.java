package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Cliente;

public interface IClienteService 
{
	Cliente create (Cliente c);
	
	Cliente update (Cliente c);
	
	Cliente findById (Integer id);
	
	List<Cliente> findall ();
	
	void delete(Integer id);

}
