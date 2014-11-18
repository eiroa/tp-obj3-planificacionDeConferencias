/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Schedule#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Schedule#getActividades <em>Actividades</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Schedule#getFin <em>Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject
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
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getSchedule_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Schedule#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Actividades</b></em>' containment reference list.
   * The list contents are of type {@link ar.unq.edu.objetos3.pdc.Actividad}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actividades</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actividades</em>' containment reference list.
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getSchedule_Actividades()
   * @model containment="true"
   * @generated
   */
  EList<Actividad> getActividades();

  /**
   * Returns the value of the '<em><b>Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fin</em>' attribute.
   * @see #setFin(String)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getSchedule_Fin()
   * @model
   * @generated
   */
  String getFin();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Schedule#getFin <em>Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fin</em>' attribute.
   * @see #getFin()
   * @generated
   */
  void setFin(String value);

} // Schedule
