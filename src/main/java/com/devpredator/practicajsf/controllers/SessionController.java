/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.practicajsf.dto.UsuarioDTO;

/**
 * @author kevin Clase que se encarga de mantener la informacion del usuario que
 *         ingresa al aplicativo en sesion
 */

@ManagedBean
@SessionScoped
public class SessionController {
	private UsuarioDTO usuarioDTO;

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en sesion...");
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
