package com.manish.repository;

import com.manish.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

    List<Customers> findByEmail(String email);
}
