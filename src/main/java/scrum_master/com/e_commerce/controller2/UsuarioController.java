package scrum_master.com.e_commerce.controller2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.DTO.UsuarioDTO;
import scrum_master.com.e_commerce.entities.RolEntity;
import scrum_master.com.e_commerce.entities.UsuarioEntity;
import scrum_master.com.e_commerce.service.UsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public List<UsuarioDTO> getUsuarios() {
        return usuarioService.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    @PostMapping("")
    public UsuarioDTO addUsuario(@RequestBody UsuarioDTO dto) {
        UsuarioEntity usuario = convertToEntity(dto);
        UsuarioEntity saved = usuarioService.save(usuario);
        return convertToDTO(saved);
    }

    private UsuarioDTO convertToDTO(UsuarioEntity entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setIdUsuario(entity.getIdUsuario());
        dto.setNombre(entity.getNombre());
        dto.setCorreo(entity.getCorreo());
        dto.setCelular(entity.getCelular());
        if (entity.getRol() != null) {
            dto.setIdRol(entity.getRol().getIdRol());
            dto.setNombreRol(entity.getRol().getNombreRol());
        }
        return dto;
    }

    private UsuarioEntity convertToEntity(UsuarioDTO dto) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setIdUsuario(dto.getIdUsuario());
        entity.setNombre(dto.getNombre());
        entity.setCorreo(dto.getCorreo());
        entity.setCelular(dto.getCelular());

        if (dto.getIdRol() > 0) {
            RolEntity rol = new RolEntity();
            rol.setIdRol(dto.getIdRol());
            entity.setRol(rol);
        }

        return entity;
    }
}

