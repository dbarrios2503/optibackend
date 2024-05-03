/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.App.entities.Requerimento;

/**
 *
 * @author Daniel BC 2
 */
public interface RequerimientoRepository extends JpaRepository<Requerimento , Integer> {
   
}
