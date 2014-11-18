/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organizacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Organizacion#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getOrganizacion()
 * @model
 * @generated
 */
public interface Organizacion extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getOrganizacion_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Organizacion#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

} // Organizacion
