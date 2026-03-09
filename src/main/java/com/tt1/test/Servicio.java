package com.tt1.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Servicio {
    private Repositorio repositorio;
    private MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public void crearTarea(String nombre, LocalDate fechaLimite) {
        repositorio.almacenarToDo(new ToDo(nombre, "", fechaLimite));
        verificarYAlertar();
    }

    public void agregarEmail(String email) {
        repositorio.almacenarEmail(email);
        verificarYAlertar();
    }

    public void finalizarTarea(String nombre) {
        repositorio.marcarComoCompletado(nombre);
        verificarYAlertar();
    }

    public List<ToDo> consultarPendientes() {
        verificarYAlertar();
        return repositorio.obtenerTodos().stream()
                .filter(t -> !t.isCompletado())
                .collect(Collectors.toList());
    }

    private void verificarYAlertar() {
        LocalDate hoy = LocalDate.now();
        boolean hayVencidos = repositorio.obtenerTodos().stream()
                .anyMatch(t -> !t.isCompletado() && t.getFechaLimite().isBefore(hoy));

        if (hayVencidos) {
            List<String> correos = repositorio.obtenerEmails();
            for (String email : correos) {
                mailer.enviarCorreo(email, "Alerta: Hay tareas pendientes cuya fecha limite ha pasado.");
            }
        }
    }
}