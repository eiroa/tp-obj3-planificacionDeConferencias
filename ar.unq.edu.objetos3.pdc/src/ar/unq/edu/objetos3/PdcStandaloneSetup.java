/*
* generated by Xtext
*/
package ar.unq.edu.objetos3;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PdcStandaloneSetup extends PdcStandaloneSetupGenerated{

	public static void doSetup() {
		new PdcStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

