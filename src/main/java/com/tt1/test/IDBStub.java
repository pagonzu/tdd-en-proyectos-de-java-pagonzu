package com.tt1.test;
import java.util.List;

public interface IDBStub {
    void insertarTarea(ToDo tarea);
    ToDo buscarTarea(String nombre);
    List<ToDo> obtenerTodas();
    void agregarEmail(String email);
    List<String> obtenerEmails();
}