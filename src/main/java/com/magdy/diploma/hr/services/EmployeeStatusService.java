package com.magdy.diploma.hr.services;


import com.magdy.diploma.hr.models.EmployeeStatus;
import com.magdy.diploma.hr.repositories.EmployeeStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeStatusService {

    @Autowired
    private EmployeeStatusRepository employeeStatusRepository;

    //Get All EmployeeStatuss
    public List<EmployeeStatus> findAll(){
        return employeeStatusRepository.findAll();
    }

    //Get EmployeeStatus By Id
    public Optional<EmployeeStatus> findById(int id) {
        return employeeStatusRepository.findById(id);
    }

    //Delete EmployeeStatus
    public void delete(int id) {
        employeeStatusRepository.deleteById(id);
    }

    //Update EmployeeStatus
    public void save( EmployeeStatus employeeStatus) {
        employeeStatusRepository.save(employeeStatus);
    }
}
