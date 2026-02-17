package com.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
