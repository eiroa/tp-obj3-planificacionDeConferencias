/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Orador#getName <em>Name</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Orador#getOrganizacion <em>Organizacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getOrador()
 * @model
 * @generated
 */
public interface Orador extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getOrador_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Orador#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Organizacion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizacion</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizacion</em>' reference.
   * @see #setOrganizacion(Organizacion)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getOrador_Organizacion()
   * @model
   * @generated
   */
  Organizacion getOrganizacion();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Orador#getOrganizacion <em>Organizacion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organizacion</em>' reference.
   * @see #getOrganizacion()
   * @generated
   */
  void setOrganizacion(Organizacion value);

} // Orador
