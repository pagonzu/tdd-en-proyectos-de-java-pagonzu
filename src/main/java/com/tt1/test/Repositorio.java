package com.tt1.test;
import java.util.List;

public class Repositorio implements IRepositorio {
    private IDBStub db;

    public Repositorio(IDBStub db) { this.db = db; }

    @Override
    public ToDo encontrarToDo(String nombre) { return db.buscarTarea(nombre); }

    @Override
    public void marcarComoCompletado(String nombre) {
        ToDo t = db.buscarTarea(nombre);
        if (t != null) t.setCompletado(true);
    }

    @Override
    public void almacenarToDo(ToDo todo) { db.insertarTarea(todo); }

    @Override
    public void almacenarEmail(String email) { db.agregarEmail(email); }

    @Override
    public List<ToDo> obtenerTodos() { return db.obtenerTodas(); }

    @Override
    public List<String> obtenerEmails() { return db.obtenerEmails(); }
}