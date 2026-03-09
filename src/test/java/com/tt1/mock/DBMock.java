package com.tt1.mock;
import com.tt1.test.*;
import java.util.List;
import java.util.ArrayList;

public class DBMock implements IDBStub {
    public boolean insertarLlamado = false;
    @Override public void insertarTarea(ToDo t) { insertarLlamado = true; }
    @Override public ToDo buscarTarea(String n) { return null; }
    @Override public List<ToDo> obtenerTodas() { return new ArrayList<>(); }
    @Override public void agregarEmail(String e) {}
    @Override public List<String> obtenerEmails() { return new ArrayList<>(); }
}