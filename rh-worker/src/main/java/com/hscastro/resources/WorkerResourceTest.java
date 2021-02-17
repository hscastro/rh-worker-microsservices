package com.hscastro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hscastro.entities.Worker;
import com.hscastro.repositories.WorkerRepository;

@RestController
@RequestMapping
public class WorkerResourceTest {

	@Autowired
	private WorkerRepository workerRepository;
	
	public ResponseEntity<List<Worker>> lista(){
		List<Worker> lista = workerRepository.findAll(); 
		return ResponseEntity.ok(lista);
	}
}
