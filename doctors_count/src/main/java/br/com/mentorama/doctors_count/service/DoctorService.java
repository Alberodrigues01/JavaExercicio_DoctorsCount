package br.com.mentorama.doctors_count.service;

import br.com.mentorama.doctors_count.model.Doctor;
import br.com.mentorama.doctors_count.repository.DoctorRepository;
import jdk.nashorn.internal.objects.annotations.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    @Autowired
    private Doctor doctor;

   @Autowired
    private DoctorRepository doctorRepository;

    // possibilidade 1 de elaboração do método que gera a contagem
    Map<Doctor, Long> doctorsByDepartment = doctors
                .stream()
                .collect(Collectors.groupingBy(
                        Doctor::getDepartment,
                        Collectors.counting()));
        //return ???;
    }

    //// possibilidade 1 de elaboração do método que gera a contagem
    Map<Doctor, Long> doctorByDepartment_modo2 = doctors
            .stream()
            .flatMap(d->doctor.getDepartment().stream())
            .collect(Collectors.groupingBy(Function.identity(),
                    Collectors.counting()));

}
