package org.cc.creativecornerapi.repository;

import org.cc.creativecornerapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User>, CrudRepository<User,Integer> {
}
