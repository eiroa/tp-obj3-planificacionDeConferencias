/**
 */
package ar.unq.edu.objetos3.pdc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hora</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Hora#getHora <em>Hora</em>}</li>
 *   <li>{@link ar.unq.edu.objetos3.pdc.Hora#getMinutos <em>Minutos</em>}</li>
 * </ul>
 * </p>
 *
 * @see ar.unq.edu.objetos3.pdc.PdcPackage#getHora()
 * @model
 * @generated
 */
public interface Hora extends EObject
{
  /**
   * Returns the value of the '<em><b>Hora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora</em>' attribute.
   * @see #setHora(int)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getHora_Hora()
   * @model
   * @generated
   */
  int getHora();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Hora#getHora <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora</em>' attribute.
   * @see #getHora()
   * @generated
   */
  void setHora(int value);

  /**
   * Returns the value of the '<em><b>Minutos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minutos</em>' attribute.
   * @see #setMinutos(int)
   * @see ar.unq.edu.objetos3.pdc.PdcPackage#getHora_Minutos()
   * @model
   * @generated
   */
  int getMinutos();

  /**
   * Sets the value of the '{@link ar.unq.edu.objetos3.pdc.Hora#getMinutos <em>Minutos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minutos</em>' attribute.
   * @see #getMinutos()
   * @generated
   */
  void setMinutos(int value);

} // Hora
