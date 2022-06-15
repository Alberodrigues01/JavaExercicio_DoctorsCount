package br.com.mentorama.doctors_count.controller;


import br.com.mentorama.doctors_count.model.Doctor;
import br.com.mentorama.doctors_count.service.DoctorService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors-by-department")
    public ResponseEntity <List<Doctor>> doctorsByDepartment(){
        return new ResponseEntity<>(doctorService.doctorsByDepartment(), HttpStatus.OK );

    }
}
