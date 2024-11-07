package com.insuranceproject.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insuranceproject.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Serializable> {

}
