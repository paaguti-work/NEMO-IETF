/*
 * generated by Xtext
 */
package com.telefonica.ietf.nemo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NemoDSLStandaloneSetup extends NemoDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new NemoDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

