/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Actividad#getOradores <em>Oradores</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad()
 * @model
 * @generated
 */
public interface Actividad extends EObject
{
  /**
   * Returns the value of the '<em><b>Oradores</b></em>' containment reference list.
   * The list contents are of type {@link ar.unq.edu.objetos3.pdc.Orador}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oradores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oradores</em>' containment reference list.
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getActividad_Oradores()
   * @model containment="true"
   * @generated
   */
  EList<Orador> getOradores();

} // Actividad
