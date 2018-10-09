/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsw.prova1.entidades;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 01701020920
 */
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
    
}
