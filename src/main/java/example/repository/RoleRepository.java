/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.repository;

import example.model.Role;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author renan
 */
public interface RoleRepository extends CrudRepository<Role, Long>{
}