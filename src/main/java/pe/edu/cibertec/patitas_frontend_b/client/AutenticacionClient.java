package pe.edu.cibertec.patitas_frontend_b.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.cibertec.patitas_frontend_b.dto.LoginRequestDTO;
import pe.edu.cibertec.patitas_frontend_b.dto.LoginResponseDTO;

@FeignClient(name = "auntenticacion", url = "http://localhost:8081/autenticacion")
public interface AutenticacionClient {

    @PostMapping("/login")
    ResponseEntity<LoginResponseDTO> login(LoginRequestDTO loginRequestDTO);

}
