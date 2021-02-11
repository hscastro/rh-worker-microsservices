package com.hscastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hscastro.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
