package com.hscastro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hscastro.entities.Worker;
import com.hscastro.repositories.WorkerRepository;


@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository workerRepository;

	
	public ResponseEntity<Worker> save(@RequestBody Worker worker) {
		Worker w = workerRepository.save(worker);
		return ResponseEntity.ok(w);
	}
	
	@GetMapping(value = "/{id}")	
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = workerRepository.findById(id).get();
		return ResponseEntity.ok(obj);		
	}
	
	@GetMapping	
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> lista = workerRepository.findAll();
		return ResponseEntity.ok(lista);		
	}
	
}
