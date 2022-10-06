package com.art.servlet;

import com.art.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
//        userService.getAll().forEach( user -> writer.write("""
//                <h1>%d: %s</h1>""".formatted(user.id(), user.name())));

        userService.getAll().forEach( user -> writer.write(String.format("<h1>%d: %s</h1>", user.getId(), user.getName())));
    }
}
