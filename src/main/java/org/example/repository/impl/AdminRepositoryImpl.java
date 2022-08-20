package org.example.repository.impl;

import org.example.entity.Admin;
import org.example.repository.AdminRepository;

import java.sql.SQLException;

public class AdminRepositoryImpl implements AdminRepository {
    @Override
    public void save(Admin admin) throws SQLException {

    }

    @Override
    public Admin load(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public boolean loadByUsername(String username) throws SQLException {
        return false;
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) throws SQLException {

    }

    @Override
    public void changeUsername(String oldUsername, String newUsername, String password) throws SQLException {

    }
}
