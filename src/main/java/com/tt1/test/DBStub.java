package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> agendaEmails = new ArrayList<>();

    public void insertarTarea(ToDo tarea) {
        tareas.add(tarea);
    }

    public ToDo buscarTarea(String nombre) {
        return tareas.stream()
                .filter(t -> t.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public List<ToDo> obtenerTodas() {
        return new ArrayList<>(tareas);
    }

    public void agregarEmail(String email) {
        agendaEmails.add(email);
    }

    public List<String> obtenerEmails() {
        return new ArrayList<>(agendaEmails);
    }
}