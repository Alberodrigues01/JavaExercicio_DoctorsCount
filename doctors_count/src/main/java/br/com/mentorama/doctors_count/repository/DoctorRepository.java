package br.com.mentorama.doctors_count.repository;

import br.com.mentorama.doctors_count.model.Doctor;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DoctorRepository {

    public List<Doctor> doctors;

    public DoctorRepository (){
        this.doctors = new ArrayList<>();

        Doctor doctor1 = new Doctor(1, "José", "cardiologia");
        Doctor doctor2 = new Doctor(2, "João", "cardiologia");
        Doctor doctor3 = new Doctor(3, "Maria", "cardiologia");
        Doctor doctor4 = new Doctor(4, "Ana", "clínica");
        Doctor doctor5 = new Doctor(1, "Carlos", "clínica");
        Doctor doctor6 = new Doctor(1, "Lúcia", "uti");

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);

    }

    public List<Doctor> findAll() {
        return doctors;
    }
}
