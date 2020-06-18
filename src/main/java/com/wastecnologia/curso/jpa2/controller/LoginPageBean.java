package com.wastecnologia.curso.jpa2.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.SecurityContext;
import javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.UsernamePasswordCredential;

@Named("loginBean")
@RequestScoped
public class LoginPageBean {

	@Inject
	FacesContext facesContext;

	@Inject
	ExternalContext externalContext;

	@Inject
	SecurityContext securityContext;

	@Inject
	HttpServletRequest request;

	@NotNull
	private String username;

	@NotNull
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login() {
		Credential credential = new UsernamePasswordCredential(username, password);
		HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();

		AuthenticationStatus status = securityContext.authenticate(request, response,
				AuthenticationParameters.withParams().credential(credential));

		if(status.equals(AuthenticationStatus.SEND_CONTINUE)) {
			facesContext.responseComplete();
		}else if(status.equals(AuthenticationStatus.SEND_FAILURE)) {
			facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Wrong username or password","Wrong username or password"));
		}
		
	}

}
