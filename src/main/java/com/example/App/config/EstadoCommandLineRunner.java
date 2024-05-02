package com.example.App.config;

import com.example.App.entities.Estado;
import com.example.App.repositories.EstadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EstadoCommandLineRunner implements CommandLineRunner {
    private final EstadoRepository estadoRepository;
    @Override
    public void run(String... args) throws Exception {
        estadoRepository.save(new Estado(0, "papelera"));
        estadoRepository.save(new Estado(1, "borrador"));
        estadoRepository.save(new Estado(2, "archivado"));
        estadoRepository.save(new Estado(3, "enviado"));
        estadoRepository.save(new Estado(4, "aprovado"));
        estadoRepository.save(new Estado(5, "rechazado"));
        estadoRepository.save(new Estado(6, "cotizado"));
        estadoRepository.save(new Estado(7, "seleccionado"));
    }
}
