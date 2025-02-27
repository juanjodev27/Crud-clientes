package com.example.crud.clientes.service;

import com.example.crud.clientes.entity.Cliente;
import com.example.crud.clientes.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerTodos(){
        return  clienteRepository.findAll();
    }

    public Cliente obtenerPorId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente actualizarCliente(Long id,Cliente cliente){
        Cliente clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID cliente no valido"));
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setEmail(cliente.getEmail());
        clienteExistente.setEdad(cliente.getEdad());
        clienteExistente.setDireccion(cliente.getDireccion());
        return clienteRepository.save(clienteExistente);
    }

    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
