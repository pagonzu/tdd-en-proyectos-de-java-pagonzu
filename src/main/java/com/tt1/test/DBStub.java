package com.tt1.test;
import java.util.ArrayList;
import java.util.List;

public class DBStub implements IDBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> agendaEmails = new ArrayList<>();

    @Override
    public void insertarTarea(ToDo tarea) { tareas.add(tarea); }

    @Override
    public ToDo buscarTarea(String nombre) {
        return tareas.stream().filter(t -> t.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    @Override
    public List<ToDo> obtenerTodas() { return new ArrayList<>(tareas); }

    @Override
    public void agregarEmail(String email) { agendaEmails.add(email); }

    @Override
    public List<String> obtenerEmails() { return new ArrayList<>(agendaEmails); }
}