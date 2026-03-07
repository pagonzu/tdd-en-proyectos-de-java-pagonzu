package com.tt1.test;

public class Repositorio {
    private DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }

    public ToDo encontrarToDo(String nombre) {
        return db.buscarTarea(nombre);
    }

    public void marcarComoCompletado(String nombre) {
        ToDo todo = db.buscarTarea(nombre);
        if (todo != null) {
            todo.setCompletado(true);
        }
    }

    public void almacenarToDo(ToDo todo) {
        db.insertarTarea(todo);
    }

    public void almacenarEmail(String email) {
        db.agregarEmail(email);
    }
    
    public java.util.List<ToDo> obtenerTodos() {
        return db.obtenerTodas();
    }
    
    public java.util.List<String> obtenerEmails() {
        return db.obtenerEmails();
    }
}