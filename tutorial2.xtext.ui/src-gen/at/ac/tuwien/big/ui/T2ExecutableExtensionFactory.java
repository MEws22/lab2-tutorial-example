/*
 * generated by Xtext 2.27.0
 */
package at.ac.tuwien.big.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import tutorial2.xtext.ui.internal.XtextActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class T2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(XtextActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.AT_AC_TUWIEN_BIG_T2) : null;
	}

}
