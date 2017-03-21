package com.coderovers.makesurvey.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coderovers.makesurvey.domain.User;

/**
 * @author Manish Karki
 * 
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
