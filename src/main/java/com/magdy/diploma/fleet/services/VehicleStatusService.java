package com.magdy.diploma.fleet.services;
import com.magdy.diploma.fleet.models.VehicleStatus;
import com.magdy.diploma.fleet.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {
	
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
	
	//Get All VehicleStatus
	public List<VehicleStatus> findAll(){
		return vehicleStatusRepository.findAll();
	}	
	
	//Get VehicleStatus By Id
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusRepository.findById(id);
	}	
	
	//Delete VehicleStatus
	public void delete(int id) {
		vehicleStatusRepository.deleteById(id);
	}
	
	//Update VehicleStatus
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}

}
