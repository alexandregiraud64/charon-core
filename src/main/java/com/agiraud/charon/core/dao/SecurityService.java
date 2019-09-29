package com.agiraud.charon.core.dao;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
