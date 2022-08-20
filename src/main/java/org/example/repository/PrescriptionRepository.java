package org.example.repository;

import org.example.entity.Drug;
import org.example.entity.Patient;
import org.example.entity.Prescription;

import java.sql.SQLException;

public interface PrescriptionRepository {
    void save(Drug drug, Patient patient) throws SQLException;
    void changeConfirmMode(boolean confirm, String nationalCode) throws SQLException;
    void changePaymentMode(boolean pay, String nationalCode) throws SQLException;
    void remove(Patient patient) throws SQLException;
    void changeExistMode(boolean exist, String name) throws SQLException;
    void addPrice(String name, long price, String nationalCode) throws SQLException;
    Prescription loadBeforeConfirm(Patient patient) throws SQLException;
    Prescription loadAfterConfirm(Patient patient) throws SQLException;
    Prescription loadAll() throws SQLException;

}
