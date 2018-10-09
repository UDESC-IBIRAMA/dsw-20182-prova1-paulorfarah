package dsw.prova1.service;

import dsw.prova1.entidades.Cliente;
import dsw.prova1.entidades.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
    
    @Autowired
    private ClienteRepositorio clientes;
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return clientes.save(cliente);
    }    
    
    @GetMapping
    public List<Cliente> listar(){
        return clientes.findAll();
    }
    
    @PutMapping
    public Cliente editar(@RequestBody Cliente cliente){
        return clientes.save(cliente);
    }
}
