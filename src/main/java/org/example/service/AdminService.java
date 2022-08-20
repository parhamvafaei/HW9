package org.example.service;

import org.example.entity.Admin;

import java.sql.SQLException;

public interface AdminService {
    boolean save(String username, String password) throws SQLException;
    Admin load(String username, String password) throws SQLException;
    boolean changePassword(Admin admin, String newPassword) throws SQLException;
    boolean changeUsername(Admin admin, String newUsername) throws SQLException;
}
