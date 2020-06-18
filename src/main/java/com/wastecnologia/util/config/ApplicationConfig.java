/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wastecnologia.util.config;

/**
 *
 * @author Willian
 */
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;

import org.glassfish.soteria.identitystores.annotation.Credentials;
import org.glassfish.soteria.identitystores.annotation.EmbeddedIdentityStoreDefinition;

@CustomFormAuthenticationMechanismDefinition(loginToContinue = @LoginToContinue(errorPage = "/login.xhtml", loginPage = "/login.xhtml"))
@EmbeddedIdentityStoreDefinition({
		@Credentials(callerName = "testing", password = "password1234", groups = { "SAMPLE_ROLE" }) })
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@ApplicationScoped
public class ApplicationConfig {

}
