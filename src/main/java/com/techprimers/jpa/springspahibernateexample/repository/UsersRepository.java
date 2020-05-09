package com.techprimers.jpa.springspahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springspahibernateexample.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
