package org.example.service;

import org.example.entity.Patient;
import org.example.entity.Prescription;

import java.sql.SQLException;

public interface PrescriptionService {
    boolean save(String name, int quantity, Patient patient) throws SQLException;
    boolean addPrice(String name, long price, String nationalCode) throws SQLException;
    Prescription load(Patient patient) throws SQLException;
    void remove(Patient patient) throws SQLException;

}
