package com.credvip.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credvip.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	//Interface que herda de JPA recebendo a classe(entidade) e o tipo de ID(Neste caso, long)

}
