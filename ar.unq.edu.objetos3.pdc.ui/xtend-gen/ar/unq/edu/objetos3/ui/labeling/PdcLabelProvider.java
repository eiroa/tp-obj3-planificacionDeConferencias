/**
 * generated by Xtext
 */
package ar.unq.edu.objetos3.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class PdcLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public PdcLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}