package com.example.atividade_2.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class LoginService {
    public void validateLogin(String user, String password, HttpServletRequest req) throws Exception{

        if (user == null | user.isEmpty()) {
            throw new Exception("Usuario Invalido");
        }


        if (user == null | user.isEmpty()) {
            throw new Exception("Senha Invalida");
        }

        if (user.equals("admin") && password.equals("admin")) {

            HttpSession session = req.getSession();
            session.setAttribute("is_logged_in", "true");
            session.setAttribute("user", "user");

        } else {
            throw new Exception("Usuario ou senha incorreta");
        }






    }


}



