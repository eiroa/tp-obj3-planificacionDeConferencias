/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Espacio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Espacio#getName <em>Name</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Espacio#getCapacidad <em>Capacidad</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Espacio#isTieneComputadoras <em>Tiene Computadoras</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getEspacio()
 * @model
 * @generated
 */
public interface Espacio extends EObject
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
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getEspacio_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Espacio#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capacidad</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capacidad</em>' attribute.
   * @see #setCapacidad(int)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getEspacio_Capacidad()
   * @model
   * @generated
   */
  int getCapacidad();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Espacio#getCapacidad <em>Capacidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capacidad</em>' attribute.
   * @see #getCapacidad()
   * @generated
   */
  void setCapacidad(int value);

  /**
   * Returns the value of the '<em><b>Tiene Computadoras</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tiene Computadoras</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tiene Computadoras</em>' attribute.
   * @see #setTieneComputadoras(boolean)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getEspacio_TieneComputadoras()
   * @model
   * @generated
   */
  boolean isTieneComputadoras();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Espacio#isTieneComputadoras <em>Tiene Computadoras</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tiene Computadoras</em>' attribute.
   * @see #isTieneComputadoras()
   * @generated
   */
  void setTieneComputadoras(boolean value);

} // Espacio
