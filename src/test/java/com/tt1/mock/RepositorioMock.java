package com.tt1.mock;
import com.tt1.test.*;
import java.util.List;
import java.util.ArrayList;

public class RepositorioMock implements IRepositorio {
    public boolean almacenarLlamado = false;
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    @Override public void almacenarToDo(ToDo t) { almacenarLlamado = true; tareas.add(t); }
    @Override public List<ToDo> obtenerTodos() { return tareas; }
    @Override public List<String> obtenerEmails() { return emails; }
    @Override public ToDo encontrarToDo(String n) { return null; }
    @Override public void marcarComoCompletado(String n) {}
    @Override public void almacenarEmail(String e) { emails.add(e); }
}