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
 *   <li>{@link ar.unq.edu.objetos3.pdc.Espacio#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Espacio#getCapacidad <em>Capacidad</em>}</li>
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
   * Returns the value of the '<em><b>Titulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Titulo</em>' attribute.
   * @see #setTitulo(String)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getEspacio_Titulo()
   * @model
   * @generated
   */
  String getTitulo();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Espacio#getTitulo <em>Titulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titulo</em>' attribute.
   * @see #getTitulo()
   * @generated
   */
  void setTitulo(String value);

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

} // Espacio
