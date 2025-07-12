package com.example.patient_service.service;

import com.example.patient_service.dto.PatientRequestDto;
import com.example.patient_service.dto.PatientResponseDto;
import com.example.patient_service.exception.EmailAlreadyExistsException;
import com.example.patient_service.mapper.PatientMapper;
import com.example.patient_service.model.Patient;
import com.example.patient_service.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

   public List<PatientResponseDto> getPatients(){

        List<Patient>  patients = patientRepository.findAll();

       return patients.stream().map(
                PatientMapper::toDto
        ).toList();
   }


   public PatientResponseDto createPatient(@Valid @RequestBody PatientRequestDto patientRequestDto){
        if (patientRepository.existsByEmail(patientRequestDto.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists: " + patientRequestDto.getEmail());
        }
        Patient patient = patientRepository.save(
                PatientMapper.toModel(patientRequestDto)
        );
        return PatientMapper.toDto(patient);
   }


}
