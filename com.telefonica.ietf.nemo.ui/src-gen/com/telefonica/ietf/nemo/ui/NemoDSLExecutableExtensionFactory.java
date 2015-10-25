/*
 * generated by Xtext
 */
package com.telefonica.ietf.nemo.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.telefonica.ietf.nemo.ui.internal.NemoDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NemoDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return NemoDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return NemoDSLActivator.getInstance().getInjector(NemoDSLActivator.COM_TELEFONICA_IETF_NEMO_NEMODSL);
	}
	
}