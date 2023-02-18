/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author kevin clase que se encarga de cerrar la sesion del usuario
 */

@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión");
	}

	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// Mensaje opcional
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Metodo que permite redireccionar a una pantalla
	 */

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
