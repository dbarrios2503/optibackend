package com.example.app.dto;
import com.example.App.DTO.DepartamentoDTO;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CotizacionDTO {
  
    private int id_cotizacion;
    private String titulo ;
    private MultipartFile pdf;
    private DepartamentoDTO dDto;
    private ClienteDTO cdto;
}
