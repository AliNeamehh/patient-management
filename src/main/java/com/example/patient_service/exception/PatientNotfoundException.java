package com.example.patient_service.exception;

public class PatientNotfoundException extends RuntimeException {

    public PatientNotfoundException(String message) {
        super(message);
    }
}
