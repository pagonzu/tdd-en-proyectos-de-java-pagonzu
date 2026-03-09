package com.tt1.test;
import java.util.List;

public interface IRepositorio {
    ToDo encontrarToDo(String nombre);
    void marcarComoCompletado(String nombre);
    void almacenarToDo(ToDo todo);
    void almacenarEmail(String email);
    List<ToDo> obtenerTodos();
    List<String> obtenerEmails();
}