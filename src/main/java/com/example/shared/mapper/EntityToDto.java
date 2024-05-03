/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.shared.mapper;

/**
 *
 * @author Daniel BC 2
 */
public interface EntityToDto <E,O> {
    
    O toDto(E e);
    E toEntity(O o);
    
}
